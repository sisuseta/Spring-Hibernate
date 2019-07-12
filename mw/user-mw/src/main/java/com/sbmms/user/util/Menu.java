/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sbmms.user.util;

import com.sb.mms.mw.BaseValue;

/**
 *
 * @author BK Tamilmani
 */
public class Menu extends BaseValue{
    private int id;
    private String name;
    private String url;
    private String icon;
    private String pageType;
    private String menu_type;
    private int parentId;
    private int pageId;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the pageType
     */
    public String getPageType() {
        return pageType;
    }

    /**
     * @param pageType the pageType to set
     */
    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    /**
     * @return the menu_type
     */
    public String getMenu_type() {
        return menu_type;
    }

    /**
     * @param menu_type the menu_type to set
     */
    public void setMenu_type(String menu_type) {
        this.menu_type = menu_type;
    }

    /**
     * @return the parentId
     */
    public int getParentId() {
        return parentId;
    }

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    /**
     * @return the pageId
     */
    public int getPageId() {
        return pageId;
    }

    /**
     * @param pageId the pageId to set
     */
    public void setPageId(int pageId) {
        this.pageId = pageId;
    }
}
