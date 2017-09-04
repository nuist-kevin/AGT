package com.caiwen.web.domain;

public class Step {

    private Integer id;

    private Integer sequence;

    private PageElement pageElement;

    private Operation operation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public PageElement getPageElement() {
        return pageElement;
    }

    public void setPageElement(PageElement pageElement) {
        this.pageElement = pageElement;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
