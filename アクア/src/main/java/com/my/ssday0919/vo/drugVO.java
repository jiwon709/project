package com.my.ssday0919.vo;

public class drugVO {

   private String drug_nm;
   private String business_m;
   private String ss;
   private String product_img;
   private String display_f;
   private String display_b;
   private String medicine_jh;
   private String color_f;
   private String color_b;
   private String line_f;
   private String line_b;
   private float size_lg;
   private float size_st;
   private String dv_m;
   private String drug_dv;
   private String item_date;
   private String jg_code;
   private String test_f;
   private String test_b;
   private String img_f;
   private String img_b;
   private String code_f;
   private String code_b;
   private String do_not;
   
   public drugVO() {}

   public drugVO(String drug_nm, String business_m, String ss, String product_img, String display_f, String display_b,
         String medicine_jh, String color_f, String color_b, String line_f, String line_b, float size_lg,
         float size_st, String dv_m, String drug_dv, String item_date, String jg_code, String test_f, String test_b,
         String img_f, String img_b, String code_f, String code_b, String do_not) {
      this.drug_nm = drug_nm;
      this.business_m = business_m;
      this.ss = ss;
      this.product_img = product_img;
      this.display_f = display_f;
      this.display_b = display_b;
      this.medicine_jh = medicine_jh;
      this.color_f = color_f;
      this.color_b = color_b;
      this.line_f = line_f;
      this.line_b = line_b;
      this.size_lg = size_lg;
      this.size_st = size_st;
      this.dv_m = dv_m;
      this.drug_dv = drug_dv;
      this.item_date = item_date;
      this.jg_code = jg_code;
      this.test_f = test_f;
      this.test_b = test_b;
      this.img_f = img_f;
      this.img_b = img_b;
      this.code_f = code_f;
      this.code_b = code_b;
      this.do_not = do_not;
   }

   public String getDrug_nm() {
      return drug_nm;
   }

   public void setDrug_nm(String drug_nm) {
      this.drug_nm = drug_nm;
   }

   public String getBusiness_m() {
      return business_m;
   }

   public void setBusiness_m(String business_m) {
      this.business_m = business_m;
   }

   public String getSs() {
      return ss;
   }

   public void setSs(String ss) {
      this.ss = ss;
   }

   public String getProduct_img() {
      return product_img;
   }

   public void setProduct_img(String product_img) {
      this.product_img = product_img;
   }

   public String getDisplay_f() {
      return display_f;
   }

   public void setDisplay_f(String display_f) {
      this.display_f = display_f;
   }

   public String getDisplay_b() {
      return display_b;
   }

   public void setDisplay_b(String display_b) {
      this.display_b = display_b;
   }

   public String getMedicine_jh() {
      return medicine_jh;
   }

   public void setMedicine_jh(String medicine_jh) {
      this.medicine_jh = medicine_jh;
   }

   public String getColor_f() {
      return color_f;
   }

   public void setColor_f(String color_f) {
      this.color_f = color_f;
   }

   public String getColor_b() {
      return color_b;
   }

   public void setColor_b(String color_b) {
      this.color_b = color_b;
   }

   public String getLine_f() {
      return line_f;
   }

   public void setLine_f(String line_f) {
      this.line_f = line_f;
   }

   public String getLine_b() {
      return line_b;
   }

   public void setLine_b(String line_b) {
      this.line_b = line_b;
   }

   public float getSize_lg() {
      return size_lg;
   }

   public void setSize_lg(float size_lg) {
      this.size_lg = size_lg;
   }

   public float getSize_st() {
      return size_st;
   }

   public void setSize_st(float size_st) {
      this.size_st = size_st;
   }

   public String getDv_m() {
      return dv_m;
   }

   public void setDv_m(String dv_m) {
      this.dv_m = dv_m;
   }

   public String getDrug_dv() {
      return drug_dv;
   }

   public void setDrug_dv(String drug_dv) {
      this.drug_dv = drug_dv;
   }

   public String getItem_date() {
      return item_date;
   }

   public void setItem_date(String item_date) {
      this.item_date = item_date;
   }

   public String getJg_code() {
      return jg_code;
   }

   public void setJg_code(String jg_code) {
      this.jg_code = jg_code;
   }

   public String getTest_f() {
      return test_f;
   }

   public void setTest_f(String test_f) {
      this.test_f = test_f;
   }

   public String getTest_b() {
      return test_b;
   }

   public void setTest_b(String test_b) {
      this.test_b = test_b;
   }

   public String getImg_f() {
      return img_f;
   }

   public void setImg_f(String img_f) {
      this.img_f = img_f;
   }

   public String getImg_b() {
      return img_b;
   }

   public void setImg_b(String img_b) {
      this.img_b = img_b;
   }

   public String getCode_f() {
      return code_f;
   }

   public void setCode_f(String code_f) {
      this.code_f = code_f;
   }

   public String getCode_b() {
      return code_b;
   }

   public void setCode_b(String code_b) {
      this.code_b = code_b;
   }

   public String getDo_not() {
      return do_not;
   }

   public void setDo_not(String do_not) {
      this.do_not = do_not;
   }

   @Override
   public String toString() {
      return "DrugVO [drug_nm=" + drug_nm + ", business_m=" + business_m + ", ss=" + ss + ", product_img="
            + product_img + ", display_f=" + display_f + ", display_b=" + display_b + ", medicine_jh=" + medicine_jh
            + ", color_f=" + color_f + ", color_b=" + color_b + ", line_f=" + line_f + ", line_b=" + line_b
            + ", size_lg=" + size_lg + ", size_st=" + size_st + ", dv_m=" + dv_m + ", drug_dv=" + drug_dv
            + ", item_date=" + item_date + ", jg_code=" + jg_code + ", test_f=" + test_f + ", test_b=" + test_b
            + ", img_f=" + img_f + ", img_b=" + img_b + ", code_f=" + code_f + ", code_b=" + code_b + ", do_not="
            + do_not + "]";
   }
   
}