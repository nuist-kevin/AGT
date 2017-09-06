package com.caiwen.web.domain.page;

import java.util.List;

public class Page {

  private Integer id;

  private String name;

  private String url;

  private String title;

  private List<PageElement> pageElements;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<PageElement> getPageElements() {
    return pageElements;
  }

  public void setPageElements(List<PageElement> pageElements) {
    this.pageElements = pageElements;
  }
}
