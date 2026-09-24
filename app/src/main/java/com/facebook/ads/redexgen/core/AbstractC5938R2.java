package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.R2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC5938R2 {
    public static byte[] A0I;
    public static String[] A0J = {"xyZ8yvYzp3wrHAf7Yx6bEToOMuLBTkeJ", "zRc0P2oS", "sxpemPSbJ0zjH5L170Fpc8WIJnMfTOYM", "JLvxwq6R3Maitb0M5MelMbaPMbiMlz5H", "qno0WD9sdyP92Tf9SwtsGsNlEh6m7cws", "isTf1gingqqcw8OSNjwv80foOygzMJYI", "cYtNYfyLYrQzxoivZChv", "OeXF3cqFYKXlQ2ABbzPAkdUOYZHirWRh"};
    public int A00;
    public C5901QQ A01;
    public AbstractC5951RF A02;
    public C47457M A03;
    public boolean A08;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public final InterfaceC5959RN A0G = new C6964hj(this);
    public final InterfaceC5959RN A0H = new C6962hh(this);
    public C5961RP A04 = new C5961RP(this.A0G);
    public C5961RP A05 = new C5961RP(this.A0H);
    public boolean A09 = false;
    public boolean A07 = false;
    public boolean A06 = false;
    public boolean A0F = true;
    public boolean A0E = true;

    public static String A09(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 20);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0I = new byte[]{99, -122, -122, -121, -122, 66, 120, -117, -121, -103, 66, -118, -125, -107, 66, 116, -121, -123, -101, -123, -114, -121, -108, 120, -117, -121, -103, 66, -125, -107, 66, -110, -125, -108, -121, -112, -106, 66, -124, -105, -106, 66, -104, -117, -121, -103, 66, -117, -107, 66, -112, -111, -106, 66, -125, 66, -108, -121, -125, -114, 66, -123, -118, -117, -114, -122, 80, 66, 119, -112, -120, -117, -114, -106, -121, -108, -121, -122, 66, -117, -112, -122, -121, -102, 92, -88, -58, -45, -45, -44, -39, -123, -46, -44, -37, -54, -123, -58, -123, -56, -51, -50, -47, -55, -123, -53, -41, -44, -46, -123, -45, -44, -45, -110, -54, -35, -50, -40, -39, -50, -45, -52, -123, -50, -45, -55, -54, -35, -97};
    }

    public abstract int A1f(int i, C5946RA c5946ra, C5953RH c5953rh);

    public abstract int A1g(int i, C5946RA c5946ra, C5953RH c5953rh);

    public abstract int A1h(C5953RH c5953rh);

    public abstract int A1i(C5953RH c5953rh);

    public abstract int A1j(C5953RH c5953rh);

    public abstract int A1k(C5953RH c5953rh);

    public abstract int A1l(C5953RH c5953rh);

    public abstract int A1m(C5953RH c5953rh);

    public abstract Parcelable A1n();

    public abstract View A1p(View view, int i, C5946RA c5946ra, C5953RH c5953rh);

    public abstract C5939R3 A1q();

    public abstract void A1r(int i);

    public abstract void A1s(int i, int i2, C5953RH c5953rh, InterfaceC5936R0 interfaceC5936R0);

    public abstract void A1t(int i, InterfaceC5936R0 interfaceC5936R0);

    public abstract void A1u(Parcelable parcelable);

    public abstract void A1w(C5946RA c5946ra, C5953RH c5953rh);

    public abstract void A1z(C47457M c47457m, C5953RH c5953rh, int i);

    public abstract boolean A21();

    public abstract boolean A22();

    public abstract boolean A23();

    public abstract boolean A24();

    static {
        A0A();
    }

    public static int A02(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                int iMax = Math.max(i2, i3);
                int size2 = A0J[1].length();
                if (size2 != 8) {
                    throw new RuntimeException();
                }
                A0J[1] = "W1fJ2ceK";
                int mode2 = Math.min(size, iMax);
                return mode2;
            case 1073741824:
                return size;
            default:
                int mode3 = Math.max(i2, i3);
                return mode3;
        }
    }

    public static int A03(int i, int i2, int i3, int i4, boolean z) {
        int iMax = Math.max(0, i - i3);
        int i5 = 0;
        int resultMode = 0;
        if (z) {
            if (i4 >= 0) {
                i5 = i4;
                resultMode = 1073741824;
            } else if (i4 == -1) {
                switch (i2) {
                    case Integer.MIN_VALUE:
                    case 1073741824:
                        i5 = iMax;
                        resultMode = i2;
                        break;
                    case 0:
                        i5 = 0;
                        resultMode = 0;
                        break;
                }
            } else if (i4 == -2) {
                i5 = 0;
                resultMode = 0;
            }
        } else if (i4 >= 0) {
            i5 = i4;
            resultMode = 1073741824;
        } else if (i4 == -1) {
            i5 = iMax;
            resultMode = i2;
        } else if (i4 == -2) {
            i5 = iMax;
            resultMode = (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? Integer.MIN_VALUE : 0;
        }
        int size = View.MeasureSpec.makeMeasureSpec(i5, resultMode);
        return size;
    }

    private final int A04(View view) {
        return ((C5939R3) view.getLayoutParams()).A03.bottom;
    }

    private final int A05(View view) {
        return ((C5939R3) view.getLayoutParams()).A03.left;
    }

    private final int A06(View view) {
        return ((C5939R3) view.getLayoutParams()).A03.right;
    }

    private final int A07(View view) {
        return ((C5939R3) view.getLayoutParams()).A03.top;
    }

    private final int A08(C5946RA c5946ra, C5953RH c5953rh) {
        return 0;
    }

    private final void A0B(int i) {
        A0E(i, A0v(i));
    }

    private final void A0C(int i) {
        View child = A0v(i);
        if (child != null) {
            this.A01.A0D(i);
        }
    }

    private final void A0D(int i, int i2) {
        View view = A0v(i);
        if (view != null) {
            A0B(i);
            A0G(view, i2);
            String[] strArr = A0J;
            if (strArr[2].charAt(30) != strArr[5].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[0] = "fev5lwy8caKDFGGcVLFTWETO5UF90dOq";
            strArr2[7] = "EDoCIrgXqzBYQTf4WlngJinORtzJmrfl";
            return;
        }
        throw new IllegalArgumentException(A09(85, 44, 81) + i + this.A03.toString());
    }

    private void A0E(int i, View view) {
        this.A01.A0C(i);
    }

    private final void A0F(View view) {
        this.A01.A0F(view);
    }

    private final void A0G(View view, int i) {
        A0H(view, i, (C5939R3) view.getLayoutParams());
    }

    private final void A0H(View view, int i, C5939R3 c5939r3) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (abstractC5956RKA0F.A0g()) {
            this.A03.A0t.A09(abstractC5956RKA0F);
        } else {
            this.A03.A0t.A0A(abstractC5956RKA0F);
        }
        this.A01.A0H(view, i, c5939r3, abstractC5956RKA0F.A0g());
    }

    private void A0I(View view, int i, boolean z) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (z || abstractC5956RKA0F.A0g()) {
            this.A03.A0t.A09(abstractC5956RKA0F);
        } else {
            this.A03.A0t.A0A(abstractC5956RKA0F);
        }
        C5939R3 c5939r3 = (C5939R3) view.getLayoutParams();
        if (abstractC5956RKA0F.A0m() || abstractC5956RKA0F.A0h()) {
            if (abstractC5956RKA0F.A0h()) {
                abstractC5956RKA0F.A0Y();
            } else {
                abstractC5956RKA0F.A0U();
            }
            this.A01.A0H(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            C47457M c47457m = this.A03;
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            A0J[4] = "uqKRxBtg59XPGVJDkfwEUsBOgdJYSppJ";
            if (parent == c47457m) {
                int currentIndex = this.A01.A07(view);
                if (i == -1) {
                    i = this.A01.A05();
                }
                if (currentIndex != -1) {
                    if (currentIndex != i) {
                        this.A03.A06.A0D(currentIndex, i);
                    }
                } else {
                    throw new IllegalStateException(A09(0, 85, 14) + this.A03.indexOfChild(view) + this.A03.A1J());
                }
            } else {
                this.A01.A0I(view, i, false);
                c5939r3.A01 = true;
                AbstractC5951RF abstractC5951RF = this.A02;
                if (A0J[4].charAt(12) == 'v') {
                    throw new RuntimeException();
                }
                A0J[6] = "si9YLNjLFs";
                if (abstractC5951RF != null && this.A02.A0F()) {
                    this.A02.A0C(view);
                }
            }
        }
        if (c5939r3.A02) {
            View view2 = abstractC5956RKA0F.A0H;
            if (A0J[1].length() != 8) {
                throw new RuntimeException();
            }
            A0J[1] = "bg493IDm";
            view2.invalidate();
            c5939r3.A02 = false;
        }
    }

    private final void A0J(View view, Rect rect) {
        C47457M.A0o(view, rect);
    }

    private void A0L(C5946RA c5946ra, int i, View view) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (abstractC5956RKA0F.A0l()) {
            return;
        }
        if (abstractC5956RKA0F.A0f()) {
            boolean zA0g = abstractC5956RKA0F.A0g();
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[2] = "wfzQKDpvqCerNRZHLtQvgaB031c5C1YU";
            strArr[5] = "KgFz3HBRwd8cETJWtdM1PF8pjKUjBKYl";
            if (!zA0g && !this.A03.A04.A0M()) {
                A0C(i);
                c5946ra.A0X(abstractC5956RKA0F);
                return;
            }
        }
        A0B(i);
        c5946ra.A0S(view);
        this.A03.A0t.A0C(abstractC5956RKA0F);
    }

    private final void A0M(C5946RA c5946ra, C5953RH c5953rh, AccessibilityEvent accessibilityEvent) {
        if (this.A03 == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!this.A03.canScrollVertically(1) && !this.A03.canScrollVertically(-1) && !this.A03.canScrollHorizontally(-1) && !this.A03.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        if (this.A03.A04 != null) {
            accessibilityEvent.setItemCount(this.A03.A04.A0B());
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    private final void A0N(C5946RA c5946ra, C5953RH c5953rh, C5881Q6 c5881q6) {
        if (this.A03.canScrollVertically(-1)) {
            c5881q6.A0N(8192);
            c5881q6.A0R(true);
        } else {
            boolean zCanScrollHorizontally = this.A03.canScrollHorizontally(-1);
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0J;
            strArr[2] = "KDPDh71uiY9dw6lSrmH00w2HuhKAvOYl";
            strArr[5] = "F84YzGx02ov8ufnexIEGkhiaGhnINbYS";
            if (zCanScrollHorizontally) {
                c5881q6.A0N(8192);
                c5881q6.A0R(true);
            }
        }
        if (this.A03.canScrollVertically(1)) {
            c5881q6.A0N(4096);
            c5881q6.A0R(true);
        } else {
            C47457M c47457m = this.A03;
            if (A0J[3].charAt(19) != 'k') {
                A0J[6] = "8s5rDkFpP";
                if (c47457m.canScrollHorizontally(1)) {
                    c5881q6.A0N(4096);
                    c5881q6.A0R(true);
                }
            } else {
                String[] strArr2 = A0J;
                strArr2[2] = "3WqpoC752q4h2Wya5fT3BPHdY3ZkhgYP";
                strArr2[5] = "HauWKBzmz4VUJQZuXSWVI1MWGOc6zBYt";
                if (c47457m.canScrollHorizontally(1)) {
                    c5881q6.A0N(4096);
                    c5881q6.A0R(true);
                }
            }
        }
        C5878Q3 collectionInfo = C5878Q3.A00(A0t(c5946ra, c5953rh), A0s(c5946ra, c5953rh), A0R(c5946ra, c5953rh), A08(c5946ra, c5953rh));
        c5881q6.A0P(collectionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(AbstractC5951RF abstractC5951RF) {
        if (this.A02 == abstractC5951RF) {
            this.A02 = null;
        }
    }

    private final boolean A0P() {
        return this.A02 != null && this.A02.A0F();
    }

    public static boolean A0Q(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        switch (mode) {
            case Integer.MIN_VALUE:
                return size >= i;
            case 0:
                return true;
            case 1073741824:
                return size == i;
            default:
                return false;
        }
    }

    private final boolean A0R(C5946RA c5946ra, C5953RH c5953rh) {
        return false;
    }

    private final boolean A0S(C5946RA c5946ra, C5953RH c5953rh, int i, Bundle bundle) {
        if (this.A03 == null) {
            return false;
        }
        int hScroll = 0;
        int i2 = 0;
        switch (i) {
            case 4096:
                if (this.A03.canScrollVertically(1)) {
                    int hScroll2 = A0Z();
                    int vScroll = A0i();
                    int hScroll3 = hScroll2 - vScroll;
                    int vScroll2 = A0f();
                    hScroll = hScroll3 - vScroll2;
                }
                if (this.A03.canScrollHorizontally(1)) {
                    int iA0j = A0j();
                    int vScroll3 = A0g();
                    int i3 = iA0j - vScroll3;
                    int vScroll4 = A0h();
                    i2 = i3 - vScroll4;
                }
                break;
            case 8192:
                if (this.A03.canScrollVertically(-1)) {
                    int hScroll4 = A0Z();
                    int vScroll5 = A0i();
                    int hScroll5 = hScroll4 - vScroll5;
                    int vScroll6 = A0f();
                    hScroll = -(hScroll5 - vScroll6);
                }
                if (this.A03.canScrollHorizontally(-1)) {
                    int iA0j2 = A0j();
                    int vScroll7 = A0g();
                    int i4 = iA0j2 - vScroll7;
                    int vScroll8 = A0h();
                    i2 = -(i4 - vScroll8);
                }
                break;
        }
        if (hScroll == 0 && i2 == 0) {
            return false;
        }
        this.A03.scrollBy(i2, hScroll);
        return true;
    }

    private final boolean A0T(C5946RA c5946ra, C5953RH c5953rh, View view, int i, Bundle bundle) {
        return false;
    }

    private boolean A0U(C47457M c47457m, int i, int i2) {
        View focusedChild = c47457m.getFocusedChild();
        if (focusedChild == null) {
            return false;
        }
        int parentBottom = A0g();
        int parentRight = A0i();
        int parentTop = A0j();
        int parentTop2 = parentTop - A0h();
        int parentLeft = A0Z();
        int parentLeft2 = parentLeft - A0f();
        Rect rect = this.A03.A0p;
        A0J(focusedChild, rect);
        if (rect.left - i >= parentTop2 || rect.right - i <= parentBottom || rect.top - i2 >= parentLeft2 || rect.bottom - i2 <= parentRight) {
            return false;
        }
        return true;
    }

    @Deprecated
    private final boolean A0V(C47457M c47457m, View view, View view2) {
        return A0P() || c47457m.A1s();
    }

    private int[] A0W(View view, Rect rect) {
        int[] iArr = new int[2];
        int offScreenRight = A0g();
        int offScreenTop = A0i();
        int dy = A0j() - A0h();
        int offScreenLeft = A0Z() - A0f();
        int childBottom = (view.getLeft() + rect.left) - view.getScrollX();
        int childRight = (view.getTop() + rect.top) - view.getScrollY();
        int childLeft = rect.width() + childBottom;
        int parentLeft = rect.height();
        int parentBottom = Math.min(0, childBottom - offScreenRight);
        int parentRight = Math.min(0, childRight - offScreenTop);
        int parentTop = Math.max(0, childLeft - dy);
        int parentLeft2 = Math.max(0, (parentLeft + childRight) - offScreenLeft);
        if (A0c() == 1) {
            if (parentTop == 0) {
                parentTop = Math.max(parentBottom, childLeft - dy);
            }
        } else {
            parentTop = parentBottom != 0 ? parentBottom : Math.min(childBottom - offScreenRight, parentTop);
        }
        if (parentRight == 0) {
            parentRight = Math.min(childRight - offScreenTop, parentLeft2);
        }
        iArr[0] = parentTop;
        iArr[1] = parentRight;
        return iArr;
    }

    public final int A0X() {
        return -1;
    }

    public final int A0Y() {
        if (this.A01 != null) {
            return this.A01.A05();
        }
        return 0;
    }

    public final int A0Z() {
        return this.A0A;
    }

    public final int A0a() {
        return this.A0B;
    }

    public final int A0b() {
        AbstractC5926Qq a2;
        if (this.A03 != null) {
            C47457M c47457m = this.A03;
            if (A0J[3].charAt(19) == 'k') {
                throw new RuntimeException();
            }
            A0J[4] = "NhHtbEzlhB3n2IblVpNcmlHtdyAdrFMd";
            a2 = c47457m.getAdapter();
        } else {
            a2 = null;
        }
        if (a2 != null) {
            return a2.A0B();
        }
        return 0;
    }

    public final int A0c() {
        return AbstractC5857Ph.A01(this.A03);
    }

    public final int A0d() {
        return AbstractC5857Ph.A02(this.A03);
    }

    public final int A0e() {
        return AbstractC5857Ph.A03(this.A03);
    }

    public final int A0f() {
        if (this.A03 != null) {
            return this.A03.getPaddingBottom();
        }
        return 0;
    }

    public final int A0g() {
        if (this.A03 != null) {
            return this.A03.getPaddingLeft();
        }
        return 0;
    }

    public final int A0h() {
        if (this.A03 != null) {
            return this.A03.getPaddingRight();
        }
        return 0;
    }

    public final int A0i() {
        if (this.A03 != null) {
            return this.A03.getPaddingTop();
        }
        return 0;
    }

    public final int A0j() {
        return this.A0C;
    }

    public final int A0k() {
        return this.A0D;
    }

    public final int A0l(View view) {
        return view.getBottom() + A04(view);
    }

    public final int A0m(View view) {
        return view.getLeft() - A05(view);
    }

    public final int A0n(View view) {
        Rect rect = ((C5939R3) view.getLayoutParams()).A03;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public final int A0o(View view) {
        Rect rect = ((C5939R3) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public final int A0p(View view) {
        return view.getRight() + A06(view);
    }

    public final int A0q(View view) {
        return view.getTop() - A07(view);
    }

    public final int A0r(View view) {
        return ((C5939R3) view.getLayoutParams()).A00();
    }

    public int A0s(C5946RA c5946ra, C5953RH c5953rh) {
        if (this.A03 == null || this.A03.A04 == null || !A22()) {
            return 1;
        }
        return this.A03.A04.A0B();
    }

    public int A0t(C5946RA c5946ra, C5953RH c5953rh) {
        if (this.A03 == null || this.A03.A04 == null || !A23()) {
            return 1;
        }
        return this.A03.A04.A0B();
    }

    public final View A0u() {
        View focusedChild;
        if (this.A03 == null || (focusedChild = this.A03.getFocusedChild()) == null || this.A01.A0K(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final View A0v(int i) {
        if (this.A01 != null) {
            return this.A01.A09(i);
        }
        return null;
    }

    public final View A0w(View view, int i) {
        return null;
    }

    public C5939R3 A0x(Context context, AttributeSet attributeSet) {
        return new C5939R3(context, attributeSet);
    }

    public C5939R3 A0y(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C5939R3) {
            return new C5939R3((C5939R3) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C5939R3((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C5939R3(layoutParams);
    }

    public final void A0z() {
        if (this.A02 != null) {
            this.A02.A09();
        }
    }

    public final void A10() {
        if (this.A03 != null) {
            this.A03.requestLayout();
        }
    }

    public final void A11(int i) {
        if (this.A03 != null) {
            this.A03.A1V(i);
        }
    }

    public final void A12(int i) {
        if (this.A03 != null) {
            this.A03.A1W(i);
        }
    }

    public final void A13(int i, int i2) {
        this.A0C = View.MeasureSpec.getSize(i);
        this.A0D = View.MeasureSpec.getMode(i);
        if (this.A0D == 0 && !C47457M.A1B) {
            this.A0C = 0;
        }
        this.A0A = View.MeasureSpec.getSize(i2);
        this.A0B = View.MeasureSpec.getMode(i2);
        if (this.A0B == 0 && !C47457M.A1B) {
            this.A0A = 0;
        }
    }

    public final void A14(int i, int i2) {
        int iA0Y = A0Y();
        if (iA0Y == 0) {
            this.A03.A1c(i, i2);
            String[] strArr = A0J;
            String str = strArr[2];
            String str2 = strArr[5];
            int iCharAt = str.charAt(30);
            int count = str2.charAt(30);
            if (iCharAt != count) {
                throw new RuntimeException();
            }
            A0J[1] = "XwkGDyjU";
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < iA0Y; i5++) {
            View viewA0v = A0v(i5);
            Rect rect = this.A03.A0p;
            A0J(viewA0v, rect);
            int count2 = rect.left;
            if (count2 < i3) {
                i3 = rect.left;
            }
            int count3 = rect.right;
            if (count3 > maxY) {
                maxY = rect.right;
            }
            int count4 = rect.top;
            if (count4 < i4) {
                i4 = rect.top;
            }
            int count5 = rect.bottom;
            if (count5 > maxX) {
                maxX = rect.bottom;
            }
        }
        this.A03.A0p.set(i3, i4, maxY, maxX);
        A17(this.A03.A0p, i, i2);
    }

    public final void A15(int i, int i2) {
        this.A03.setMeasuredDimension(i, i2);
    }

    public final void A16(int i, C5946RA c5946ra) {
        View view = A0v(i);
        A0C(i);
        c5946ra.A0T(view);
    }

    public void A17(Rect rect, int i, int i2) {
        int usedHeight = rect.width() + A0g() + A0h();
        int iHeight = rect.height();
        int usedWidth = A0i();
        int i3 = iHeight + usedWidth;
        int usedWidth2 = A0f();
        int width = i3 + usedWidth2;
        int usedWidth3 = A0e();
        int usedHeight2 = A02(i, usedHeight, usedWidth3);
        int usedWidth4 = A0d();
        A15(usedHeight2, A02(i2, width, usedWidth4));
    }

    public final void A18(View view) {
        A1A(view, -1);
    }

    public final void A19(View view) {
        A1B(view, -1);
    }

    public final void A1A(View view, int i) {
        A0I(view, i, true);
    }

    public final void A1B(View view, int i) {
        A0I(view, i, false);
    }

    public final void A1C(View view, int i, int i2) {
        C5939R3 c5939r3 = (C5939R3) view.getLayoutParams();
        Rect rectA1D = this.A03.A1D(view);
        int i3 = i + rectA1D.left + rectA1D.right;
        int i4 = i2 + rectA1D.top + rectA1D.bottom;
        int iA03 = A03(A0j(), A0k(), A0g() + A0h() + c5939r3.leftMargin + c5939r3.rightMargin + i3, c5939r3.width, A22());
        int iA0Z = A0Z();
        int iA0a = A0a();
        int widthSpec = A0i();
        int iA04 = A03(iA0Z, iA0a, widthSpec + A0f() + c5939r3.topMargin + c5939r3.bottomMargin + i4, c5939r3.height, A23());
        if (A1Y(view, iA03, iA04, c5939r3)) {
            view.measure(iA03, iA04);
        }
    }

    public final void A1D(View view, int i, int i2, int i3, int i4) {
        C5939R3 c5939r3 = (C5939R3) view.getLayoutParams();
        Rect rect = c5939r3.A03;
        view.layout(rect.left + i + c5939r3.leftMargin, rect.top + i2 + c5939r3.topMargin, (i3 - rect.right) - c5939r3.rightMargin, (i4 - rect.bottom) - c5939r3.bottomMargin);
    }

    public final void A1E(View view, C5881Q6 c5881q6) {
        AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(view);
        if (abstractC5956RKA0F != null) {
            boolean zA0g = abstractC5956RKA0F.A0g();
            if (A0J[4].charAt(12) == 'v') {
                throw new RuntimeException();
            }
            A0J[1] = "uJMRqraa";
            if (!zA0g && !this.A01.A0K(abstractC5956RKA0F.A0H)) {
                A1M(this.A03.A0r, this.A03.A0s, view, c5881q6);
            }
        }
    }

    public final void A1F(View view, C5946RA c5946ra) {
        A0F(view);
        c5946ra.A0T(view);
    }

    public final void A1G(View view, boolean z, Rect rect) {
        Matrix matrix;
        if (z) {
            Rect rect2 = ((C5939R3) view.getLayoutParams()).A03;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        } else {
            rect.set(0, 0, view.getWidth(), view.getHeight());
        }
        C47457M c47457m = this.A03;
        String[] strArr = A0J;
        if (strArr[0].charAt(23) != strArr[7].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[0] = "0LJ8GvUexdNG1AG11Ii0XfPOyD5lBlCr";
        strArr2[7] = "NwYNIOYDHD2wNBVOHxFlNgVOQtOI4Jp5";
        if (c47457m != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A03.A0q;
            rectF.set(rect);
            matrix.mapRect(rectF);
            int iFloor = (int) Math.floor(rectF.left);
            int iFloor2 = (int) Math.floor(rectF.top);
            double d = rectF.right;
            if (A0J[6].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0J;
            strArr3[0] = "AxZOVdXnwoPa2hByvRQIxFpOdsFmpigD";
            strArr3[7] = "eNbgBcin3tlOsNhY3b3xdMmObUbY1NrP";
            rect.set(iFloor, iFloor2, (int) Math.ceil(d), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final void A1H(C5881Q6 c5881q6) {
        A0N(this.A03.A0r, this.A03.A0s, c5881q6);
    }

    public final void A1I(C5946RA c5946ra) {
        int iA0E = c5946ra.A0E();
        for (int i = iA0E - 1; i >= 0; i--) {
            View viewA0F = c5946ra.A0F(i);
            AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(viewA0F);
            if (!abstractC5956RKA0F.A0l()) {
                abstractC5956RKA0F.A0d(false);
                if (abstractC5956RKA0F.A0i()) {
                    this.A03.removeDetachedView(viewA0F, false);
                }
                if (this.A03.A05 != null) {
                    this.A03.A05.A0L(abstractC5956RKA0F);
                }
                abstractC5956RKA0F.A0d(true);
                c5946ra.A0R(viewA0F);
            }
        }
        c5946ra.A0L();
        if (iA0E > 0) {
            this.A03.invalidate();
        }
    }

    public final void A1J(C5946RA c5946ra) {
        int childCount = A0Y();
        for (int i = childCount - 1; i >= 0; i--) {
            A0L(c5946ra, i, A0v(i));
        }
    }

    public final void A1K(C5946RA c5946ra) {
        for (int iA0Y = A0Y() - 1; iA0Y >= 0; iA0Y--) {
            if (!C47457M.A0F(A0v(iA0Y)).A0l()) {
                A16(iA0Y, c5946ra);
            }
        }
    }

    public void A1L(C5946RA c5946ra, C5953RH c5953rh, int i, int i2) {
        this.A03.A1c(i, i2);
    }

    public void A1M(C5946RA c5946ra, C5953RH c5953rh, View view, C5881Q6 c5881q6) {
        C5879Q4 itemInfo = C5879Q4.A00(A23() ? A0r(view) : 0, 1, A22() ? A0r(view) : 0, 1, false, false);
        c5881q6.A0Q(itemInfo);
    }

    public final void A1N(AbstractC5951RF abstractC5951RF) {
        if (this.A02 != null) {
            AbstractC5951RF abstractC5951RF2 = this.A02;
            if (A0J[4].charAt(12) == 'v') {
                throw new RuntimeException();
            }
            A0J[6] = RequestConfiguration.MAX_AD_CONTENT_RATING_G;
            if (abstractC5951RF != abstractC5951RF2 && this.A02.A0F()) {
                AbstractC5951RF abstractC5951RF3 = this.A02;
                if (A0J[6].length() != 15) {
                    A0J[3] = "jdqDA9lv9LoPYcF6nkiuFYbBQf2p3Jna";
                    abstractC5951RF3.A09();
                } else {
                    String[] strArr = A0J;
                    strArr[0] = "CfhUeeIqQu1BzHSX9SgRD70OnW7YoiZA";
                    strArr[7] = "rBLjTriW7e2LTgD4knhZEnVORkWVeovT";
                    abstractC5951RF3.A09();
                }
            }
        }
        this.A02 = abstractC5951RF;
        this.A02.A0D(this.A03, this);
    }

    public void A1O(C47457M c47457m) {
    }

    public final void A1P(C47457M c47457m) {
        this.A07 = true;
    }

    public final void A1Q(C47457M c47457m) {
        A13(View.MeasureSpec.makeMeasureSpec(c47457m.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c47457m.getHeight(), 1073741824));
    }

    public final void A1R(C47457M c47457m) {
        if (c47457m == null) {
            this.A03 = null;
            this.A01 = null;
            this.A0C = 0;
            this.A0A = 0;
        } else {
            this.A03 = c47457m;
            this.A01 = c47457m.A01;
            this.A0C = c47457m.getWidth();
            this.A0A = c47457m.getHeight();
        }
        this.A0D = 1073741824;
        this.A0B = 1073741824;
    }

    public final void A1S(C47457M c47457m, C5946RA c5946ra) {
        this.A07 = false;
        A1y(c47457m, c5946ra);
    }

    public final void A1T(boolean z) {
        this.A06 = z;
    }

    public final boolean A1U() {
        int iA0Y = A0Y();
        for (int i = 0; i < iA0Y; i++) {
            ViewGroup.LayoutParams layoutParams = A0v(i).getLayoutParams();
            int childCount = layoutParams.width;
            if (childCount < 0) {
                int childCount2 = layoutParams.height;
                if (childCount2 < 0) {
                    return true;
                }
            }
        }
        if (A0J[4].charAt(12) == 'v') {
            throw new RuntimeException();
        }
        A0J[3] = "WAOKNqtGQ8ovYE750tJA7vys4k4qcWl2";
        return false;
    }

    public final boolean A1V() {
        return this.A03 != null && this.A03.A0B;
    }

    public final boolean A1W() {
        return this.A0E;
    }

    public final boolean A1X(int i, Bundle bundle) {
        return A0S(this.A03.A0r, this.A03.A0s, i, bundle);
    }

    public final boolean A1Y(View view, int i, int i2, C5939R3 c5939r3) {
        if (!view.isLayoutRequested()) {
            boolean z = this.A0F;
            String[] strArr = A0J;
            if (strArr[0].charAt(23) != strArr[7].charAt(23)) {
                throw new RuntimeException();
            }
            A0J[4] = "WuiXnf3Uz62WBJXd3E4QIRzbwyGUV3fL";
            if (z && A0Q(view.getWidth(), i, c5939r3.width) && A0Q(view.getHeight(), i2, c5939r3.height)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A1Z(View view, int i, Bundle bundle) {
        return A0T(this.A03.A0r, this.A03.A0s, view, i, bundle);
    }

    public boolean A1a(C5939R3 c5939r3) {
        return c5939r3 != null;
    }

    public final boolean A1b(C47457M c47457m, View view, Rect rect, boolean z) {
        return A1c(c47457m, view, rect, z, false);
    }

    public final boolean A1c(C47457M c47457m, View view, Rect rect, boolean z, boolean z2) {
        int[] scrollAmount = A0W(view, rect);
        int i = scrollAmount[0];
        int i2 = scrollAmount[1];
        if ((z2 && !A0U(c47457m, i, i2)) || (i == 0 && i2 == 0)) {
            return false;
        }
        if (z) {
            c47457m.scrollBy(i, i2);
        } else {
            c47457m.A1e(i, i2);
        }
        return true;
    }

    public final boolean A1d(C47457M c47457m, C5953RH c5953rh, View view, View view2) {
        return A0V(c47457m, view, view2);
    }

    public final boolean A1e(C47457M c47457m, ArrayList<View> views, int i, int i2) {
        return false;
    }

    public View A1o(int i) {
        int iA0Y = A0Y();
        for (int i2 = 0; i2 < iA0Y; i2++) {
            View child = A0v(i2);
            AbstractC5956RK abstractC5956RKA0F = C47457M.A0F(child);
            if (abstractC5956RKA0F != null) {
                int childCount = abstractC5956RKA0F.A0O();
                if (childCount == i && !abstractC5956RKA0F.A0l() && (this.A03.A0s.A07() || !abstractC5956RKA0F.A0g())) {
                    return child;
                }
            }
        }
        return null;
    }

    public void A1v(AccessibilityEvent accessibilityEvent) {
        A0M(this.A03.A0r, this.A03.A0s, accessibilityEvent);
    }

    public void A1x(C5953RH c5953rh) {
    }

    public void A1y(C47457M c47457m, C5946RA c5946ra) {
    }

    public void A20(String str) {
        if (this.A03 != null) {
            this.A03.A1n(str);
        }
    }
}
