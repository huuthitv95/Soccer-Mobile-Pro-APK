package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x */
    public int f57x;

    /* JADX INFO: renamed from: y */
    public int f58y;

    public void setBounds(int i, int i2, int i3, int i4) {
        this.f57x = i;
        this.f58y = i2;
        this.width = i3;
        this.height = i4;
    }

    void grow(int i, int i2) {
        this.f57x -= i;
        this.f58y -= i2;
        this.width += i * 2;
        this.height += i2 * 2;
    }

    boolean intersects(Rectangle rectangle) {
        int i;
        int i2;
        int i3 = this.f57x;
        int i4 = rectangle.f57x;
        return i3 >= i4 && i3 < i4 + rectangle.width && (i = this.f58y) >= (i2 = rectangle.f58y) && i < i2 + rectangle.height;
    }

    public boolean contains(int i, int i2) {
        int i3;
        int i4 = this.f57x;
        return i >= i4 && i < i4 + this.width && i2 >= (i3 = this.f58y) && i2 < i3 + this.height;
    }

    public int getCenterX() {
        return (this.f57x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f58y + this.height) / 2;
    }
}
