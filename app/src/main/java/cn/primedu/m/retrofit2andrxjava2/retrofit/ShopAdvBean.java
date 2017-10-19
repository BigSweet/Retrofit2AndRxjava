package cn.primedu.m.retrofit2andrxjava2.retrofit;

import java.util.List;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@priemdu.cn
 * 时间: 2017/8/14
 */
public class ShopAdvBean {

    /**
     * configure : {"id":"1","video_url":"http://cdn2.primedu.cn/res/ad_video/5Vmjul5nKZwBgTbH1epkAMoFcw6D10V47hVVuy9T.jpg","detail_url":["http://cdn2.primedu.cn/res/ad_img/rVR2u0fX4X2XlboSWgGF1nDI224nIYRKofY2Kx4V.jpg","http://cdn2.primedu.cn/res/ad_img/qA9Diy2X8qmcJse1J0VbTity1vqP4sGntEPEegtN.jpg"],"created_at":"2017-08-14 15:48:05","updated_at":"2017-08-14 15:50:00"}
     */

    private ConfigureBean configure;

    public ConfigureBean getConfigure() {
        return configure;
    }

    public void setConfigure(ConfigureBean configure) {
        this.configure = configure;
    }

    public static class ConfigureBean {
        /**
         * id : 1
         * video_url : http://cdn2.primedu.cn/res/ad_video/5Vmjul5nKZwBgTbH1epkAMoFcw6D10V47hVVuy9T.jpg
         * detail_url : ["http://cdn2.primedu.cn/res/ad_img/rVR2u0fX4X2XlboSWgGF1nDI224nIYRKofY2Kx4V.jpg","http://cdn2.primedu.cn/res/ad_img/qA9Diy2X8qmcJse1J0VbTity1vqP4sGntEPEegtN.jpg"]
         * created_at : 2017-08-14 15:48:05
         * updated_at : 2017-08-14 15:50:00
         */

        private String id;
        private String video_url;
        private String created_at;
        private String updated_at;
        private List<String> detail_url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public List<String> getDetail_url() {
            return detail_url;
        }

        public void setDetail_url(List<String> detail_url) {
            this.detail_url = detail_url;
        }
    }
}
