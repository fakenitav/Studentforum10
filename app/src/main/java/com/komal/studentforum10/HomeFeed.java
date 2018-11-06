package com.komal.studentforum10;

public class HomeFeed {

    public String post_name;
    public String post_desc;
    public String user_id;

    public HomeFeed(){

    }

    public HomeFeed(String post_name, String post_desc, String user_id) {
        this.post_name = post_name;
        this.post_desc = post_desc;
        this.user_id = user_id;
    }

    public String getPost_name() {

        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getPost_desc() {
        return post_desc;
    }

    public void setPost_desc(String post_desc) {
        this.post_desc = post_desc;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

}