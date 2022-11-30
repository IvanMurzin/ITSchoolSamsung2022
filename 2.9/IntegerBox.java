package org.example;

public class IntegerBox {
    private Integer data;

    public IntegerBox(Integer data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(Integer data) {
        if (data == null) return;
        this.data = data;
    }
}
