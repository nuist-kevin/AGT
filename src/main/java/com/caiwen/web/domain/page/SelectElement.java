package com.caiwen.web.domain.page;

import java.util.Map;

public class SelectElement extends PageElement {

  // 格式是  option:value ，防止value为空的选项
  private Map<String, String> optionValues;

  public Map<String, String> getOptionValues() {
    return optionValues;
  }

  public void setOptionValues(Map<String, String> optionValues) {
    this.optionValues = optionValues;

  }
}
