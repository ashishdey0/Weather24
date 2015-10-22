package com.bokaromart.weather24.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ashdey on 9/20/15.
 */
public class NewsUrls {
    public Map<UrlListKeys,Map<NewsCategory,String>> getUlrList() {
        return ulrList;
    }

    final private Map<UrlListKeys,Map<NewsCategory,String>> ulrList =
            new HashMap<>();
    public NewsUrls() {
        final Map<NewsCategory,String> dailyNewsFeedsList = new HashMap<>();
        dailyNewsFeedsList.put(NewsCategory.TOP_STORIES,
                "http://dynamic.feedsportal.com/pf/555218/http://toi.timesofindia.indiatimes.com/rssfeedstopstories.cms");
        dailyNewsFeedsList.put(NewsCategory.MOST_RECENT_STORIES,
                "http://timesofindia.feedsportal.com/c/33039/f/533965/index.rss");
        dailyNewsFeedsList.put(NewsCategory.INDIA,
                "http://timesofindia.feedsportal.com/c/33039/f/533916/index.rss");
        dailyNewsFeedsList.put(NewsCategory.WORLD,
                "http://timesofindia.feedsportal.com/c/33039/f/533917/index.rss");
        dailyNewsFeedsList.put(NewsCategory.NRI,
                "http://timesofindia.indiatimes.com/rssfeeds/7098551.cms");
        dailyNewsFeedsList.put(NewsCategory.BUSINESS,
                "http://timesofindia.feedsportal.com/c/33039/f/533919/index.rss");
        dailyNewsFeedsList.put(NewsCategory.CRICKET,
                "http://timesofindia.feedsportal.com/c/33039/f/533920/index.rss");
        dailyNewsFeedsList.put(NewsCategory.SPORTS,
                "http://timesofindia.feedsportal.com/c/33039/f/533921/index.rss");
        dailyNewsFeedsList.put(NewsCategory.HEALTH,
                "http://dynamic.feedsportal.com/c/33039/f/533968/index.rss");
        dailyNewsFeedsList.put(NewsCategory.SCIENCE,
                "http://timesofindia.feedsportal.com/c/33039/f/533922/index.rss");
        dailyNewsFeedsList.put(NewsCategory.ENVIRONMENT,
                "http://timesofindia.feedsportal.com/c/33039/f/533925/index.rss");
        dailyNewsFeedsList.put(NewsCategory.TECHNOLOGY,
                "http://timesofindia.feedsportal.com/c/33039/f/533923/index.rss");
        dailyNewsFeedsList.put(NewsCategory.EDUCATION,
                "http://timesofindia.feedsportal.com/c/33039/f/533924/index.rss");
        dailyNewsFeedsList.put(NewsCategory.ENTERTAINMENT,
                "http://timesofindia.feedsportal.com/c/33039/f/533928/index.rss");
        dailyNewsFeedsList.put(NewsCategory.LIFE_STYLE,
                "http://timesofindia.feedsportal.com/c/33039/f/533929/index.rss");

        ulrList.put(UrlListKeys.DAILY_NEWS,dailyNewsFeedsList);

        /*final List<String> jobNewsFeedsList = new ArrayList<>();
        jobNewsFeedsList.add("http://www.careerbuilder.com/RTQ/rss20.aspx?rssid=RSS_PD&num=25&geoip=false&ddcompany=false&ddtitle=false&cat=JN001");
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xo=2727&xz=1_0_15&xl=rss&rss=r&type=all&qf=catid_1");// :  Top Mgmt-NonIT
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xo=2727&xz=1_0_15&xl=rss&rss=r&type=all&qf=catid_2");// :  Top Mgmt-IT/Telecom
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=1");// :  Accounting/Tax/Audit
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=15");// :  Advtg/Marketing/PR
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=44");// :  Airlines/Travel
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=24");// :  All IT/Telecom Jobs
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=37");// :  IT-Hardware/Support
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=catid_7");// :  IT/Telecom-Comp. Jobs
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=43");// :  Anchoring/TV/Films
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=2");// :  Architects/Int.Designer
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=6");// :  Bank/Insurance/Finance
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=catid_57");// :  Retailing
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=8");// :  Call Centre/Cust Service
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=5");// :  Content/Editors/Press
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=7");// :  Corporate Planning
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=36");// :  Education/Teaching
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=9");// :  Entrepreneur/Consultant
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=catid_22");// :  Entry Level/Freelance
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=10");// :  Export/Import
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=42");// :  Fashion/Textile
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=11");// :  Front Office/Secretarial
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=3");// :  Graphic/Web Designer
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=4");// :  Hotels/Restaurants
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=12");// :  HR/Admin/IR/Training
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=13");// :  Legal
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=16");// :  Medical/Healthcare
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=catid_28");// :  NGO/Govt Job/Defence
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=catid_29");// :  Overseas/International
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=18");// :  Packaging
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=catid_31");// :  Pharmaceutical/Biotech
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=20");// :  Project Mgmt/Site Engg
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=14r");// :  Purchase/SCM
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=19");// :  Production/Operations
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=21");// :  R&amp;D/Engineering Design
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=21");// :  CAD/CAM
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=22");// :  Sales
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=45");// :  Security
        jobNewsFeedsList.add("http://jobsearch.naukri.com/mynaukri/mn_newsmartsearch.php?xz=1_0_15&xo=2727&xl=rss&rss=r&type=all&qf=41");// :  Other
        ulrList.put(UrlListKeys.JOB_NEWS, jobNewsFeedsList);*/

    }
}
