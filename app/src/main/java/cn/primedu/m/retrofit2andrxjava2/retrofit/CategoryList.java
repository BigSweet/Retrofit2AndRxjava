package cn.primedu.m.retrofit2andrxjava2.retrofit;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@priemdu.cn
 * 时间: 2017/5/10
 */
public class CategoryList {

    /**
     * category_id : 9
     * f_category_id : 4
     * category_name : 初级
     * category_desc : 初级语录
     * category_pic : http://cdn2.primedu.cn/se/icon/img_words_P.png
     * pos_id : 9
     * panel_bg_color : #AFDCEA
     */

    private int category_id;
    private int f_category_id;
    private String category_name;
    private String category_desc;
    private String category_pic;
    private int pos_id;
    private String panel_bg_color;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getF_category_id() {
        return f_category_id;
    }

    public void setF_category_id(int f_category_id) {
        this.f_category_id = f_category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCategory_desc() {
        return category_desc;
    }

    public void setCategory_desc(String category_desc) {
        this.category_desc = category_desc;
    }

    public String getCategory_pic() {
        return category_pic;
    }

    public void setCategory_pic(String category_pic) {
        this.category_pic = category_pic;
    }

    public int getPos_id() {
        return pos_id;
    }

    public void setPos_id(int pos_id) {
        this.pos_id = pos_id;
    }

    public String getPanel_bg_color() {
        return panel_bg_color;
    }

    public void setPanel_bg_color(String panel_bg_color) {
        this.panel_bg_color = panel_bg_color;
    }
}
