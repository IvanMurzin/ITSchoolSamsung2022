package org.example;

public class ObjectBox {
    private Object data;

    public ObjectBox(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        if (data == null) return;
        this.data = data;
    }
}
