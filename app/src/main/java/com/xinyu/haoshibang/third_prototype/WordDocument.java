package com.xinyu.haoshibang.third_prototype;

import java.util.ArrayList;

/**
 * 文档类型,扮演的是ConcretePrototype角色,而cloneable是代表prototypt角色
 */

public class WordDocument implements Cloneable {
    //文本
    private String mText;
    //图片
    private ArrayList<String> mList = new ArrayList<>();

    public WordDocument() {
        System.out.println("----------------WordDocument-------构造函数-----");
    }

//      浅拷贝
//    @Override
//    protected WordDocument clone(){
//        try {
//            WordDocument doc = (WordDocument) super.clone();
//            doc.mText = this.mText;
//            doc.mList = this.mList;
//            return doc;
//        } catch (Exception e) {
//
//        }
//        return null;
//    }

    //深拷贝
    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            //对Images对象也调用clone()函数,进行深拷贝.
            doc.mList = (ArrayList<String>) this.mList.clone();
            return doc;
        } catch (Exception e) {

        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public ArrayList<String> getmList() {
        return mList;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public void addImage(String img) {
        this.mList.add(img);
    }

    public void showDocument() {
        System.out.println("-----Word C S");
        System.out.println("TEXT---:" + mText);
        System.out.println("ImageList: ");

        for (String imgName : mList) {
            System.out.println("image name : " + imgName);
        }
        System.out.println("----word   content     end----");
    }
}
