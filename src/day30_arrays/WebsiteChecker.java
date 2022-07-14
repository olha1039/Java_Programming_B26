package day30_arrays;

import java.util.Arrays;

public class WebsiteChecker {
    public static void main(String[] args) {
        String [] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};
        int _com = 0, _org = 0, _edu = 0, other = 0;
        for (int i = 0; i < websites.length; i++) {


            if(websites[i].contains(".com")){
                _com++;

            } else if (websites[i].contains(".org")){
                _org++;

            } else if (websites[i].contains(".edu")){
               _edu++;

            } else {
               other++;
            }
        }
        System.out.println(".com " + _com + "\n.edu " + _edu + "\n.org " + _org + "\nother " + other);

    }
}
