package com.example.refresh.bean;

import java.util.List;

/**
 * Created by 知足 on 2018/2/5.
 */

public class ShowBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-11-24 22:00","title":"明眸皓X 笑如花 【2016.11.24】","description":"华声美女","picUrl":"http://image.hnol.net/c/2016-11/24/12/201611241206206241-4761447.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7551943-0-1.html"},{"ctime":"2016-11-25 00:00","title":"女人风味 郭珉姣","description":"华声美女","picUrl":"http://image.hnol.net/c/2016-11/24/22/201611242201372341-2381913.jpeg","url":"http://bbs.voc.com.cn/mm/meinv-7553036-0-1.html"},{"ctime":"2016-11-25 00:00","title":"[贴图]靓车美女","description":"华声美女","picUrl":"http://image.hnol.net/c/2016-11/23/08/2016112308284341-4217076.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7549314-0-1.html"},{"ctime":"2016-11-25 02:00","title":"车展美模7","description":"华声美女","picUrl":"http://image.hnol.net/c/2016-11/21/14/201611211454436931-2381913.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7546382-0-1.html"},{"ctime":"2016-11-25 06:00","title":"甜美 李梓熙zixibaby 纯美姑娘前凸后翘邻家小奶牛","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/10/m.xxxiao.com_ffd65774276dca518f96d89666ac9c26-683x1024.jpg","url":"http://m.xxxiao.com/87093"},{"ctime":"2016-11-25 06:00","title":"性感嫩妹 小Kaili小丁丁 超赞颜值和身材 朦胧性感的私房床照","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/10/m.xxxiao.com_a077db1cefc1ca73167c739a32a8e422-682x1024.jpg","url":"http://m.xxxiao.com/80868"},{"ctime":"2016-11-25 08:00","title":"沈馨儿 清新养眼的小美女靓拍","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/10/m.xxxiao.com_f9d1ded1f23a9787a1220a3276ec758a-768x1024.jpg","url":"http://m.xxxiao.com/86807"},{"ctime":"2016-11-25 08:00","title":"宅男尤物 于姬Una 白璧无瑕比基尼丝滑女神苏梅岛旅拍","description":"美女写真","picUrl":"http://m.xxxiao.com/wp-content/uploads/sites/3/2016/11/m.xxxiao.com_601e06f888e0c34027c56a1e30e92f7e-682x1024.jpg","url":"http://m.xxxiao.com/91792"},{"ctime":"2016-11-25 12:00","title":"[贴图]白衣女清纯写真","description":"华声美女","picUrl":"http://image.hnol.net/c/2016-11/25/09/201611250957531771-4217076.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7553876-0-1.html"},{"ctime":"2016-11-25 12:00","title":"车展美模10","description":"华声美女","picUrl":"http://image.hnol.net/c/2016-11/25/10/20161125100541541-2381913.jpg","url":"http://bbs.voc.com.cn/mm/meinv-7553899-0-1.html"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2016-11-24 22:00
         * title : 明眸皓X 笑如花 【2016.11.24】
         * description : 华声美女
         * picUrl : http://image.hnol.net/c/2016-11/24/12/201611241206206241-4761447.jpg
         * url : http://bbs.voc.com.cn/mm/meinv-7551943-0-1.html
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
