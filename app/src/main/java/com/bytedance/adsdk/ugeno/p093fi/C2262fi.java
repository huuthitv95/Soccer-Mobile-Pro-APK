package com.bytedance.adsdk.ugeno.p093fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.xha.xha;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2262fi extends ViewGroup implements InterfaceC2266ri {

    /* JADX INFO: renamed from: aw */
    private int[] f5646aw;
    private SparseIntArray bgr;

    /* JADX INFO: renamed from: bu */
    private InterfaceC2282ka f5647bu;

    /* JADX INFO: renamed from: co */
    private int f5648co;

    /* JADX INFO: renamed from: di */
    private int f5649di;

    /* JADX INFO: renamed from: fi */
    private int f5650fi;

    /* JADX INFO: renamed from: ik */
    private int f5651ik;
    private int jbs;

    /* JADX INFO: renamed from: ka */
    private int f5652ka;

    /* JADX INFO: renamed from: lr */
    private int f5653lr;

    /* JADX INFO: renamed from: mj */
    private Drawable f5654mj;

    /* JADX INFO: renamed from: nr */
    private C2264ka.ri f5655nr;

    /* JADX INFO: renamed from: qt */
    private int f5656qt;

    /* JADX INFO: renamed from: ri */
    private int f5657ri;

    /* JADX INFO: renamed from: sf */
    private int f5658sf;
    private List<C2263ik> slm;

    /* JADX INFO: renamed from: vr */
    private C2264ka f5659vr;
    private Drawable xha;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.fi.fi$ri */
    public static class ri extends ViewGroup.MarginLayoutParams implements InterfaceC2265lr {
        public static final Parcelable.Creator<ri> CREATOR = new Parcelable.Creator<ri>() { // from class: com.bytedance.adsdk.ugeno.fi.fi.ri.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public ri createFromParcel(Parcel parcel) {
                return new ri(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public ri[] newArray(int i) {
                return new ri[i];
            }
        };

        /* JADX INFO: renamed from: di */
        private int f5660di;

        /* JADX INFO: renamed from: fi */
        private float f5661fi;

        /* JADX INFO: renamed from: ik */
        private float f5662ik;
        private int jbs;

        /* JADX INFO: renamed from: ka */
        private int f5663ka;

        /* JADX INFO: renamed from: lr */
        private float f5664lr;

        /* JADX INFO: renamed from: mj */
        private int f5665mj;

        /* JADX INFO: renamed from: qt */
        private boolean f5666qt;

        /* JADX INFO: renamed from: ri */
        private int f5667ri;
        private int xha;

        public ri(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.f5667ri = 1;
            this.f5664lr = 0.0f;
            this.f5662ik = 0.0f;
            this.f5663ka = -1;
            this.f5661fi = -1.0f;
            this.f5660di = -1;
            this.xha = -1;
            this.f5665mj = ViewCompat.MEASURED_SIZE_MASK;
            this.jbs = ViewCompat.MEASURED_SIZE_MASK;
        }

        protected ri(Parcel parcel) {
            super(0, 0);
            this.f5667ri = 1;
            this.f5664lr = 0.0f;
            this.f5662ik = 0.0f;
            this.f5663ka = -1;
            this.f5661fi = -1.0f;
            this.f5660di = -1;
            this.xha = -1;
            this.f5665mj = ViewCompat.MEASURED_SIZE_MASK;
            this.jbs = ViewCompat.MEASURED_SIZE_MASK;
            this.f5667ri = parcel.readInt();
            this.f5664lr = parcel.readFloat();
            this.f5662ik = parcel.readFloat();
            this.f5663ka = parcel.readInt();
            this.f5661fi = parcel.readFloat();
            this.f5660di = parcel.readInt();
            this.xha = parcel.readInt();
            this.f5665mj = parcel.readInt();
            this.jbs = parcel.readInt();
            this.f5666qt = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public ri(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5667ri = 1;
            this.f5664lr = 0.0f;
            this.f5662ik = 0.0f;
            this.f5663ka = -1;
            this.f5661fi = -1.0f;
            this.f5660di = -1;
            this.xha = -1;
            this.f5665mj = ViewCompat.MEASURED_SIZE_MASK;
            this.jbs = ViewCompat.MEASURED_SIZE_MASK;
        }

        public ri(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5667ri = 1;
            this.f5664lr = 0.0f;
            this.f5662ik = 0.0f;
            this.f5663ka = -1;
            this.f5661fi = -1.0f;
            this.f5660di = -1;
            this.xha = -1;
            this.f5665mj = ViewCompat.MEASURED_SIZE_MASK;
            this.jbs = ViewCompat.MEASURED_SIZE_MASK;
        }

        public ri(ri riVar) {
            super((ViewGroup.MarginLayoutParams) riVar);
            this.f5667ri = 1;
            this.f5664lr = 0.0f;
            this.f5662ik = 0.0f;
            this.f5663ka = -1;
            this.f5661fi = -1.0f;
            this.f5660di = -1;
            this.xha = -1;
            this.f5665mj = ViewCompat.MEASURED_SIZE_MASK;
            this.jbs = ViewCompat.MEASURED_SIZE_MASK;
            this.f5667ri = riVar.f5667ri;
            this.f5664lr = riVar.f5664lr;
            this.f5662ik = riVar.f5662ik;
            this.f5663ka = riVar.f5663ka;
            this.f5661fi = riVar.f5661fi;
            this.f5660di = riVar.f5660di;
            this.xha = riVar.xha;
            this.f5665mj = riVar.f5665mj;
            this.jbs = riVar.jbs;
            this.f5666qt = riVar.f5666qt;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: aw */
        public int mo7589aw() {
            return this.leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        public int bgr() {
            return this.topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: co */
        public float mo7590co() {
            return this.f5661fi;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: di */
        public int mo7591di() {
            return this.f5663ka;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: fi */
        public float mo7592fi() {
            return this.f5662ik;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: ik */
        public int mo7593ik() {
            return this.f5667ri;
        }

        /* JADX INFO: renamed from: ik */
        public void m7594ik(float f) {
            this.f5661fi = f;
        }

        /* JADX INFO: renamed from: ik */
        public void m7595ik(int i) {
            this.f5667ri = i;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        public int jbs() {
            return this.f5665mj;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: ka */
        public float mo7596ka() {
            return this.f5664lr;
        }

        /* JADX INFO: renamed from: ka */
        public void m7597ka(int i) {
            this.f5663ka = i;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: lr */
        public int mo7598lr() {
            return this.height;
        }

        /* JADX INFO: renamed from: lr */
        public void m7599lr(float f) {
            this.f5662ik = f;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: lr */
        public void mo7600lr(int i) {
            this.xha = i;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: mj */
        public int mo7601mj() {
            return this.xha;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: qt */
        public int mo7602qt() {
            return this.jbs;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: ri */
        public int mo7603ri() {
            return this.width;
        }

        /* JADX INFO: renamed from: ri */
        public void m7604ri(float f) {
            this.f5664lr = f;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: ri */
        public void mo7605ri(int i) {
            this.f5660di = i;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: sf */
        public boolean mo7606sf() {
            return this.f5666qt;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        public int slm() {
            return this.bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        /* JADX INFO: renamed from: vr */
        public int mo7607vr() {
            return this.rightMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5667ri);
            parcel.writeFloat(this.f5664lr);
            parcel.writeFloat(this.f5662ik);
            parcel.writeInt(this.f5663ka);
            parcel.writeFloat(this.f5661fi);
            parcel.writeInt(this.f5660di);
            parcel.writeInt(this.xha);
            parcel.writeInt(this.f5665mj);
            parcel.writeInt(this.jbs);
            parcel.writeByte(this.f5666qt ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2265lr
        public int xha() {
            return this.f5660di;
        }
    }

    public C2262fi(Context context) {
        super(context, null);
        this.f5649di = -1;
        this.f5659vr = new C2264ka(this);
        this.slm = new ArrayList();
        this.f5655nr = new C2264ka.ri();
    }

    /* JADX INFO: renamed from: di */
    private boolean m7562di(int i) {
        if (i >= 0 && i < this.slm.size()) {
            for (int i2 = i + 1; i2 < this.slm.size(); i2++) {
                if (this.slm.get(i2).m7610lr() > 0) {
                    return false;
                }
            }
            if (mo7588ri()) {
                return (this.jbs & 4) != 0;
            }
            if ((this.f5656qt & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: fi */
    private boolean m7563fi(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.slm.get(i2).m7610lr() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: fi */
    private boolean m7564fi(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewM7578ik = m7578ik(i - i3);
            if (viewM7578ik != null && viewM7578ik.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ik */
    private void m7565ik(int i, int i2) {
        this.slm.clear();
        this.f5655nr.m7658ri();
        this.f5659vr.m7644lr(this.f5655nr, i, i2);
        this.slm = this.f5655nr.f5691ri;
        this.f5659vr.m7649ri(i, i2);
        this.f5659vr.m7643lr(i, i2, getPaddingLeft() + getPaddingRight());
        this.f5659vr.m7647ri();
        m7573ri(this.f5657ri, i, i2, this.f5655nr.f5690lr);
    }

    /* JADX INFO: renamed from: ka */
    private boolean m7566ka(int i) {
        if (i >= 0 && i < this.slm.size()) {
            if (m7563fi(i)) {
                if (mo7588ri()) {
                    return (this.jbs & 1) != 0;
                }
                return (this.f5656qt & 1) != 0;
            }
            if (mo7588ri()) {
                return (this.jbs & 2) != 0;
            }
            if ((this.f5656qt & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ka */
    private boolean m7567ka(int i, int i2) {
        if (m7564fi(i, i2)) {
            if (mo7588ri()) {
                return (this.f5656qt & 1) != 0;
            }
            return (this.jbs & 1) != 0;
        }
        if (mo7588ri()) {
            return (this.f5656qt & 2) != 0;
        }
        return (this.jbs & 2) != 0;
    }

    /* JADX INFO: renamed from: lr */
    private void m7568lr() {
        if (this.xha == null && this.f5654mj == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m7569lr(int i, int i2) {
        this.slm.clear();
        this.f5655nr.m7658ri();
        this.f5659vr.m7653ri(this.f5655nr, i, i2);
        this.slm = this.f5655nr.f5691ri;
        this.f5659vr.m7649ri(i, i2);
        if (this.f5652ka == 3) {
            for (C2263ik c2263ik : this.slm) {
                int iMax = Integer.MIN_VALUE;
                for (int i3 = 0; i3 < c2263ik.f5676mj; i3++) {
                    View viewM7578ik = m7578ik(c2263ik.f5681vr + i3);
                    if (viewM7578ik != null && viewM7578ik.getVisibility() != 8) {
                        ri riVar = (ri) viewM7578ik.getLayoutParams();
                        iMax = this.f5653lr != 2 ? Math.max(iMax, viewM7578ik.getMeasuredHeight() + Math.max(c2263ik.f5670co - viewM7578ik.getBaseline(), riVar.topMargin) + riVar.bottomMargin) : Math.max(iMax, viewM7578ik.getMeasuredHeight() + riVar.topMargin + Math.max((c2263ik.f5670co - viewM7578ik.getMeasuredHeight()) + viewM7578ik.getBaseline(), riVar.bottomMargin));
                    }
                }
                c2263ik.xha = iMax;
            }
        }
        this.f5659vr.m7643lr(i, i2, getPaddingTop() + getPaddingBottom());
        this.f5659vr.m7647ri();
        m7573ri(this.f5657ri, i, i2, this.f5655nr.f5690lr);
    }

    /* JADX INFO: renamed from: lr */
    private void m7570lr(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.xha;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.f5658sf + i2);
        this.xha.draw(canvas);
    }

    /* JADX INFO: renamed from: lr */
    private void m7571lr(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.slm.size();
        for (int i = 0; i < size; i++) {
            C2263ik c2263ik = this.slm.get(i);
            for (int i2 = 0; i2 < c2263ik.f5676mj; i2++) {
                int i3 = c2263ik.f5681vr + i2;
                View viewM7578ik = m7578ik(i3);
                if (viewM7578ik != null && viewM7578ik.getVisibility() != 8) {
                    ri riVar = (ri) viewM7578ik.getLayoutParams();
                    if (m7567ka(i3, i2)) {
                        m7570lr(canvas, c2263ik.f5679ri, z2 ? viewM7578ik.getBottom() + riVar.bottomMargin : (viewM7578ik.getTop() - riVar.topMargin) - this.f5658sf, c2263ik.xha);
                    }
                    if (i2 == c2263ik.f5676mj - 1 && (this.jbs & 4) > 0) {
                        m7570lr(canvas, c2263ik.f5679ri, z2 ? (viewM7578ik.getTop() - riVar.topMargin) - this.f5658sf : viewM7578ik.getBottom() + riVar.bottomMargin, c2263ik.xha);
                    }
                }
            }
            if (m7566ka(i)) {
                m7574ri(canvas, z ? c2263ik.f5673ik : c2263ik.f5679ri - this.f5648co, paddingTop, iMax);
            }
            if (m7562di(i) && (this.f5656qt & 4) > 0) {
                m7574ri(canvas, z ? c2263ik.f5679ri - this.f5648co : c2263ik.f5673ik, paddingTop, iMax);
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7572ri(int i, int i2) {
        if (this.bgr == null) {
            this.bgr = new SparseIntArray(getChildCount());
        }
        if (this.f5659vr.m7645lr(this.bgr)) {
            this.f5646aw = this.f5659vr.m7655ri(this.bgr);
        }
        int i3 = this.f5657ri;
        if (i3 == 0 || i3 == 1) {
            m7569lr(i, i2);
        } else if (i3 == 2 || i3 == 3) {
            m7565ik(i, i2);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f5657ri);
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m7573ri(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i)));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
            }
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
            }
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    /* JADX INFO: renamed from: ri */
    private void m7574ri(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f5654mj;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.f5648co + i, i3 + i2);
        this.f5654mj.draw(canvas);
    }

    /* JADX INFO: renamed from: ri */
    private void m7575ri(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.slm.size();
        for (int i = 0; i < size; i++) {
            C2263ik c2263ik = this.slm.get(i);
            for (int i2 = 0; i2 < c2263ik.f5676mj; i2++) {
                int i3 = c2263ik.f5681vr + i2;
                View viewM7578ik = m7578ik(i3);
                if (viewM7578ik != null && viewM7578ik.getVisibility() != 8) {
                    ri riVar = (ri) viewM7578ik.getLayoutParams();
                    if (m7567ka(i3, i2)) {
                        m7574ri(canvas, z ? viewM7578ik.getRight() + riVar.rightMargin : (viewM7578ik.getLeft() - riVar.leftMargin) - this.f5648co, c2263ik.f5675lr, c2263ik.xha);
                    }
                    if (i2 == c2263ik.f5676mj - 1 && (this.f5656qt & 4) > 0) {
                        m7574ri(canvas, z ? (viewM7578ik.getLeft() - riVar.leftMargin) - this.f5648co : viewM7578ik.getRight() + riVar.rightMargin, c2263ik.f5675lr, c2263ik.xha);
                    }
                }
            }
            if (m7566ka(i)) {
                m7570lr(canvas, paddingLeft, z2 ? c2263ik.f5674ka : c2263ik.f5675lr - this.f5658sf, iMax);
            }
            if (m7562di(i) && (this.jbs & 4) > 0) {
                m7570lr(canvas, paddingLeft, z2 ? c2263ik.f5675lr - this.f5658sf : c2263ik.f5674ka, iMax);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:60:0x014b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x017f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0199  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01eb  */
    /* JADX INFO: renamed from: ri */
    private void m7576ri(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        int i5;
        float f;
        float f2;
        float fMax;
        int i6;
        int i7;
        View viewM7578ik;
        boolean z2;
        int i8;
        int i9;
        float f3;
        float f4;
        int i10;
        float f5;
        int i11;
        View view;
        C2263ik c2263ik;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i12 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.slm.size();
        for (int i13 = 0; i13 < size; i13++) {
            C2263ik c2263ik2 = this.slm.get(i13);
            if (m7566ka(i13)) {
                int i14 = this.f5658sf;
                paddingBottom -= i14;
                paddingTop += i14;
            }
            int i15 = paddingBottom;
            int i16 = this.f5651ik;
            char c = 4;
            int i17 = 2;
            boolean z3 = true;
            if (i16 != 0) {
                if (i16 == 1) {
                    measuredWidth = (i12 - c2263ik2.f5672fi) + paddingRight;
                    i5 = c2263ik2.f5672fi - paddingLeft;
                } else if (i16 == 2) {
                    measuredWidth = paddingLeft + ((i12 - c2263ik2.f5672fi) / 2.0f);
                    f = (i12 - paddingRight) - ((i12 - c2263ik2.f5672fi) / 2.0f);
                    f2 = 0.0f;
                } else if (i16 == 3) {
                    measuredWidth = paddingLeft;
                    int iM7610lr = c2263ik2.m7610lr();
                    f2 = (i12 - c2263ik2.f5672fi) / (iM7610lr != 1 ? iM7610lr - 1 : 1.0f);
                    f = i12 - paddingRight;
                } else if (i16 == 4) {
                    int iM7610lr2 = c2263ik2.m7610lr();
                    float f6 = iM7610lr2 != 0 ? (i12 - c2263ik2.f5672fi) / iM7610lr2 : 0.0f;
                    float f7 = f6 / 2.0f;
                    measuredWidth = paddingLeft + f7;
                    float f8 = (i12 - paddingRight) - f7;
                    f2 = f6;
                    f = f8;
                } else {
                    if (i16 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f5651ik);
                    }
                    int iM7610lr3 = c2263ik2.m7610lr();
                    f2 = iM7610lr3 != 0 ? (i12 - c2263ik2.f5672fi) / (iM7610lr3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f2;
                    f = (i12 - paddingRight) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i6 = 0;
                while (i6 < c2263ik2.f5676mj) {
                    i7 = c2263ik2.f5681vr + i6;
                    viewM7578ik = m7578ik(i7);
                    char c2 = c;
                    if (viewM7578ik != null) {
                        z2 = z3;
                        if (viewM7578ik.getVisibility() != 8) {
                            ri riVar = (ri) viewM7578ik.getLayoutParams();
                            f3 = measuredWidth + riVar.leftMargin;
                            f4 = f - riVar.rightMargin;
                            if (m7567ka(i7, i6)) {
                                int i18 = this.f5648co;
                                float f9 = i18;
                                f3 += f9;
                                f4 -= f9;
                                i10 = i18;
                            } else {
                                i10 = 0;
                            }
                            f5 = f4;
                            if (i6 == c2263ik2.f5676mj - 1 || (this.f5656qt & 4) <= 0) {
                                i11 = 0;
                            } else {
                                i11 = this.f5648co;
                            }
                            if (this.f5653lr == i17) {
                                if (z) {
                                    i8 = i17;
                                    view = viewM7578ik;
                                    this.f5659vr.m7651ri(view, c2263ik2, Math.round(f5) - viewM7578ik.getMeasuredWidth(), i15 - viewM7578ik.getMeasuredHeight(), Math.round(f5), i15);
                                } else {
                                    view = viewM7578ik;
                                    i8 = i17;
                                    this.f5659vr.m7651ri(view, c2263ik2, Math.round(f3), i15 - view.getMeasuredHeight(), Math.round(f3) + view.getMeasuredWidth(), i15);
                                }
                                i9 = i15;
                            } else {
                                i6 = i6;
                                view = viewM7578ik;
                                z2 = z2;
                                i8 = i17;
                                i9 = i15;
                                if (z) {
                                    this.f5659vr.m7651ri(view, c2263ik2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + view.getMeasuredHeight());
                                } else {
                                    int i19 = paddingTop;
                                    this.f5659vr.m7651ri(view, c2263ik2, Math.round(f3), i19, view.getMeasuredWidth() + Math.round(f3), i19 + view.getMeasuredHeight());
                                    paddingTop = i19;
                                }
                            }
                            measuredWidth = f3 + view.getMeasuredWidth() + fMax + riVar.rightMargin;
                            float measuredWidth2 = f5 - ((view.getMeasuredWidth() + fMax) + riVar.leftMargin);
                            if (z) {
                                c2263ik = c2263ik2;
                                c2263ik.m7612ri(view, i11, 0, i10, 0);
                            } else {
                                c2263ik = c2263ik2;
                                c2263ik.m7612ri(view, i10, 0, i11, 0);
                            }
                            c2263ik2 = c2263ik;
                            f = measuredWidth2;
                        } else {
                            z2 = z2;
                        }
                        i6++;
                        c = c2;
                        i17 = i8;
                        z3 = z2;
                        i15 = i9;
                    } else {
                        z2 = z3;
                    }
                    i8 = i17;
                    i6 = i6;
                    i9 = i15;
                    i6++;
                    c = c2;
                    i17 = i8;
                    z3 = z2;
                    i15 = i9;
                }
                paddingTop += c2263ik2.xha;
                paddingBottom = i15 - c2263ik2.xha;
            } else {
                measuredWidth = paddingLeft;
                i5 = i12 - paddingRight;
            }
            f = i5;
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i6 = 0;
            while (i6 < c2263ik2.f5676mj) {
                i7 = c2263ik2.f5681vr + i6;
                viewM7578ik = m7578ik(i7);
                char c3 = c;
                if (viewM7578ik != null) {
                    z2 = z3;
                    if (viewM7578ik.getVisibility() != 8) {
                        ri riVar2 = (ri) viewM7578ik.getLayoutParams();
                        f3 = measuredWidth + riVar2.leftMargin;
                        f4 = f - riVar2.rightMargin;
                        if (m7567ka(i7, i6)) {
                            int i110 = this.f5648co;
                            float f10 = i110;
                            f3 += f10;
                            f4 -= f10;
                            i10 = i110;
                        } else {
                            i10 = 0;
                        }
                        f5 = f4;
                        if (i6 == c2263ik2.f5676mj - 1) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        if (this.f5653lr == i17) {
                            if (z) {
                                i8 = i17;
                                view = viewM7578ik;
                                this.f5659vr.m7651ri(view, c2263ik2, Math.round(f5) - viewM7578ik.getMeasuredWidth(), i15 - viewM7578ik.getMeasuredHeight(), Math.round(f5), i15);
                            } else {
                                view = viewM7578ik;
                                i8 = i17;
                                this.f5659vr.m7651ri(view, c2263ik2, Math.round(f3), i15 - view.getMeasuredHeight(), Math.round(f3) + view.getMeasuredWidth(), i15);
                            }
                            i9 = i15;
                        } else {
                            i6 = i6;
                            view = viewM7578ik;
                            z2 = z2;
                            i8 = i17;
                            i9 = i15;
                            if (z) {
                                this.f5659vr.m7651ri(view, c2263ik2, Math.round(f5) - view.getMeasuredWidth(), paddingTop, Math.round(f5), paddingTop + view.getMeasuredHeight());
                            } else {
                                int i111 = paddingTop;
                                this.f5659vr.m7651ri(view, c2263ik2, Math.round(f3), i111, view.getMeasuredWidth() + Math.round(f3), i111 + view.getMeasuredHeight());
                                paddingTop = i111;
                            }
                        }
                        measuredWidth = f3 + view.getMeasuredWidth() + fMax + riVar2.rightMargin;
                        float measuredWidth3 = f5 - ((view.getMeasuredWidth() + fMax) + riVar2.leftMargin);
                        if (z) {
                            c2263ik = c2263ik2;
                            c2263ik.m7612ri(view, i11, 0, i10, 0);
                        } else {
                            c2263ik = c2263ik2;
                            c2263ik.m7612ri(view, i10, 0, i11, 0);
                        }
                        c2263ik2 = c2263ik;
                        f = measuredWidth3;
                    } else {
                        z2 = z2;
                    }
                    i6++;
                    c = c3;
                    i17 = i8;
                    z3 = z2;
                    i15 = i9;
                } else {
                    z2 = z3;
                }
                i8 = i17;
                i6 = i6;
                i9 = i15;
                i6++;
                c = c3;
                i17 = i8;
                z3 = z2;
                i15 = i9;
            }
            paddingTop += c2263ik2.xha;
            paddingBottom = i15 - c2263ik2.xha;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:63:0x0168  */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d2  */
    /* JADX INFO: renamed from: ri */
    private void m7577ri(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float measuredHeight;
        int i5;
        float f;
        float f2;
        float fMax;
        int i6;
        int i7;
        int i8;
        View viewM7578ik;
        char c;
        int i9;
        int i10;
        float f3;
        float f4;
        int i11;
        float f5;
        int i12;
        C2263ik c2263ik;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i13 = i4 - i2;
        int i14 = (i3 - i) - paddingRight;
        int size = this.slm.size();
        for (int i15 = 0; i15 < size; i15++) {
            C2263ik c2263ik2 = this.slm.get(i15);
            if (m7566ka(i15)) {
                int i16 = this.f5648co;
                paddingLeft += i16;
                i14 -= i16;
            }
            int i17 = i14;
            int i18 = this.f5651ik;
            char c2 = 4;
            int i19 = 1;
            if (i18 != 0) {
                if (i18 == 1) {
                    measuredHeight = (i13 - c2263ik2.f5672fi) + paddingBottom;
                    i5 = c2263ik2.f5672fi - paddingTop;
                } else if (i18 == 2) {
                    measuredHeight = paddingTop + ((i13 - c2263ik2.f5672fi) / 2.0f);
                    f = (i13 - paddingBottom) - ((i13 - c2263ik2.f5672fi) / 2.0f);
                    f2 = 0.0f;
                } else if (i18 == 3) {
                    measuredHeight = paddingTop;
                    int iM7610lr = c2263ik2.m7610lr();
                    f2 = (i13 - c2263ik2.f5672fi) / (iM7610lr != 1 ? iM7610lr - 1 : 1.0f);
                    f = i13 - paddingBottom;
                } else if (i18 == 4) {
                    int iM7610lr2 = c2263ik2.m7610lr();
                    f2 = iM7610lr2 != 0 ? (i13 - c2263ik2.f5672fi) / iM7610lr2 : 0.0f;
                    float f6 = f2 / 2.0f;
                    measuredHeight = paddingTop + f6;
                    f = (i13 - paddingBottom) - f6;
                } else {
                    if (i18 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f5651ik);
                    }
                    int iM7610lr3 = c2263ik2.m7610lr();
                    f2 = iM7610lr3 != 0 ? (i13 - c2263ik2.f5672fi) / (iM7610lr3 + 1) : 0.0f;
                    measuredHeight = paddingTop + f2;
                    f = (i13 - paddingBottom) - f2;
                }
                fMax = Math.max(f2, 0.0f);
                i6 = 0;
                while (i6 < c2263ik2.f5676mj) {
                    i7 = c2263ik2.f5681vr + i6;
                    i8 = i19;
                    viewM7578ik = m7578ik(i7);
                    if (viewM7578ik != null) {
                        c = c2;
                        if (viewM7578ik.getVisibility() != 8) {
                            ri riVar = (ri) viewM7578ik.getLayoutParams();
                            f3 = measuredHeight + riVar.topMargin;
                            f4 = f - riVar.bottomMargin;
                            if (m7567ka(i7, i6)) {
                                i11 = this.f5658sf;
                                float f7 = i11;
                                f3 += f7;
                                f4 -= f7;
                            } else {
                                i11 = 0;
                            }
                            f5 = f4;
                            if (i6 == c2263ik2.f5676mj - i8 || (this.jbs & 4) <= 0) {
                                i12 = 0;
                            } else {
                                i12 = this.f5658sf;
                            }
                            if (z) {
                                if (z2) {
                                    i9 = i6;
                                    this.f5659vr.m7652ri(viewM7578ik, c2263ik2, true, i17 - viewM7578ik.getMeasuredWidth(), Math.round(f5) - viewM7578ik.getMeasuredHeight(), i17, Math.round(f5));
                                } else {
                                    i9 = i6;
                                    this.f5659vr.m7652ri(viewM7578ik, c2263ik2, true, i17 - viewM7578ik.getMeasuredWidth(), Math.round(f3), i17, Math.round(f3) + viewM7578ik.getMeasuredHeight());
                                }
                                i10 = i17;
                            } else {
                                i9 = i6;
                                i8 = i8;
                                i10 = i17;
                                if (z2) {
                                    this.f5659vr.m7652ri(viewM7578ik, c2263ik2, false, paddingLeft, Math.round(f5) - viewM7578ik.getMeasuredHeight(), paddingLeft + viewM7578ik.getMeasuredWidth(), Math.round(f5));
                                } else {
                                    int i20 = paddingLeft;
                                    this.f5659vr.m7652ri(viewM7578ik, c2263ik2, false, i20, Math.round(f3), i20 + viewM7578ik.getMeasuredWidth(), Math.round(f3) + viewM7578ik.getMeasuredHeight());
                                    paddingLeft = i20;
                                }
                            }
                            measuredHeight = f3 + viewM7578ik.getMeasuredHeight() + fMax + riVar.bottomMargin;
                            float measuredHeight2 = f5 - ((viewM7578ik.getMeasuredHeight() + fMax) + riVar.topMargin);
                            if (z2) {
                                c2263ik = c2263ik2;
                                c2263ik.m7612ri(viewM7578ik, 0, i12, 0, i11);
                            } else {
                                c2263ik = c2263ik2;
                                c2263ik.m7612ri(viewM7578ik, 0, i11, 0, i12);
                            }
                            c2263ik2 = c2263ik;
                            f = measuredHeight2;
                        }
                        i6 = i9 + 1;
                        c2 = c;
                        i19 = i8;
                        i17 = i10;
                    } else {
                        c = c2;
                    }
                    i9 = i6;
                    i8 = i8;
                    i10 = i17;
                    i6 = i9 + 1;
                    c2 = c;
                    i19 = i8;
                    i17 = i10;
                }
                paddingLeft += c2263ik2.xha;
                i14 = i17 - c2263ik2.xha;
            } else {
                measuredHeight = paddingTop;
                i5 = i13 - paddingBottom;
            }
            f = i5;
            f2 = 0.0f;
            fMax = Math.max(f2, 0.0f);
            i6 = 0;
            while (i6 < c2263ik2.f5676mj) {
                i7 = c2263ik2.f5681vr + i6;
                i8 = i19;
                viewM7578ik = m7578ik(i7);
                if (viewM7578ik != null) {
                    c = c2;
                    if (viewM7578ik.getVisibility() != 8) {
                        ri riVar2 = (ri) viewM7578ik.getLayoutParams();
                        f3 = measuredHeight + riVar2.topMargin;
                        f4 = f - riVar2.bottomMargin;
                        if (m7567ka(i7, i6)) {
                            i11 = this.f5658sf;
                            float f8 = i11;
                            f3 += f8;
                            f4 -= f8;
                        } else {
                            i11 = 0;
                        }
                        f5 = f4;
                        if (i6 == c2263ik2.f5676mj - i8) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                        }
                        if (z) {
                            if (z2) {
                                i9 = i6;
                                this.f5659vr.m7652ri(viewM7578ik, c2263ik2, true, i17 - viewM7578ik.getMeasuredWidth(), Math.round(f5) - viewM7578ik.getMeasuredHeight(), i17, Math.round(f5));
                            } else {
                                i9 = i6;
                                this.f5659vr.m7652ri(viewM7578ik, c2263ik2, true, i17 - viewM7578ik.getMeasuredWidth(), Math.round(f3), i17, Math.round(f3) + viewM7578ik.getMeasuredHeight());
                            }
                            i10 = i17;
                        } else {
                            i9 = i6;
                            i8 = i8;
                            i10 = i17;
                            if (z2) {
                                this.f5659vr.m7652ri(viewM7578ik, c2263ik2, false, paddingLeft, Math.round(f5) - viewM7578ik.getMeasuredHeight(), paddingLeft + viewM7578ik.getMeasuredWidth(), Math.round(f5));
                            } else {
                                int i21 = paddingLeft;
                                this.f5659vr.m7652ri(viewM7578ik, c2263ik2, false, i21, Math.round(f3), i21 + viewM7578ik.getMeasuredWidth(), Math.round(f3) + viewM7578ik.getMeasuredHeight());
                                paddingLeft = i21;
                            }
                        }
                        measuredHeight = f3 + viewM7578ik.getMeasuredHeight() + fMax + riVar2.bottomMargin;
                        float measuredHeight3 = f5 - ((viewM7578ik.getMeasuredHeight() + fMax) + riVar2.topMargin);
                        if (z2) {
                            c2263ik = c2263ik2;
                            c2263ik.m7612ri(viewM7578ik, 0, i12, 0, i11);
                        } else {
                            c2263ik = c2263ik2;
                            c2263ik.m7612ri(viewM7578ik, 0, i11, 0, i12);
                        }
                        c2263ik2 = c2263ik;
                        f = measuredHeight3;
                    }
                    i6 = i9 + 1;
                    c2 = c;
                    i19 = i8;
                    i17 = i10;
                } else {
                    c = c2;
                }
                i9 = i6;
                i8 = i8;
                i10 = i17;
                i6 = i9 + 1;
                c2 = c;
                i19 = i8;
                i17 = i10;
            }
            paddingLeft += c2263ik2.xha;
            i14 = i17 - c2263ik2.xha;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.bgr == null) {
            this.bgr = new SparseIntArray(getChildCount());
        }
        this.f5646aw = this.f5659vr.m7656ri(view, i, layoutParams, this.bgr);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ri;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ri) {
            return new ri((ri) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ri((ViewGroup.MarginLayoutParams) layoutParams) : new ri(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public int getAlignContent() {
        return this.f5650fi;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public int getAlignItems() {
        return this.f5652ka;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.xha;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f5654mj;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public int getFlexDirection() {
        return this.f5657ri;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C2263ik> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.slm.size());
        for (C2263ik c2263ik : this.slm) {
            if (c2263ik.m7610lr() != 0) {
                arrayList.add(c2263ik);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public List<C2263ik> getFlexLinesInternal() {
        return this.slm;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public int getFlexWrap() {
        return this.f5653lr;
    }

    public int getJustifyContent() {
        return this.f5651ik;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public int getLargestMainSize() {
        Iterator<C2263ik> it = this.slm.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f5672fi);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public int getMaxLine() {
        return this.f5649di;
    }

    public int getShowDividerHorizontal() {
        return this.jbs;
    }

    public int getShowDividerVertical() {
        return this.f5656qt;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public int getSumOfCrossSize() {
        int size = this.slm.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C2263ik c2263ik = this.slm.get(i2);
            if (m7566ka(i2)) {
                i += mo7588ri() ? this.f5658sf : this.f5648co;
            }
            if (m7562di(i2)) {
                i += mo7588ri() ? this.f5658sf : this.f5648co;
            }
            i += c2263ik.xha;
        }
        return i;
    }

    /* JADX INFO: renamed from: ik */
    public View m7578ik(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f5646aw;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: lr */
    public int mo7579lr(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: lr */
    public View mo7580lr(int i) {
        return m7578ik(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5647bu;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f5647bu;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f5654mj == null && this.xha == null) {
            return;
        }
        if (this.jbs == 0 && this.f5656qt == 0) {
            return;
        }
        int iM8056ri = xha.m8056ri(this);
        int i = this.f5657ri;
        if (i == 0) {
            m7575ri(canvas, iM8056ri == 1, this.f5653lr == 2);
            return;
        }
        if (i == 1) {
            m7575ri(canvas, iM8056ri != 1, this.f5653lr == 2);
            return;
        }
        if (i == 2) {
            boolean z = iM8056ri == 1;
            if (this.f5653lr == 2) {
                z = !z;
            }
            m7571lr(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = iM8056ri == 1;
        if (this.f5653lr == 2) {
            z2 = !z2;
        }
        m7571lr(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        InterfaceC2282ka interfaceC2282ka = this.f5647bu;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7733di();
        }
        int iM8056ri = xha.m8056ri(this);
        int i5 = this.f5657ri;
        if (i5 == 0) {
            m7576ri(iM8056ri == 1, i, i2, i3, i4);
        } else if (i5 == 1) {
            m7576ri(iM8056ri != 1, i, i2, i3, i4);
        } else if (i5 == 2) {
            z2 = iM8056ri == 1;
            if (this.f5653lr == 2) {
                z2 = !z2;
            }
            m7577ri(z2, false, i, i2, i3, i4);
        } else {
            if (i5 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.f5657ri);
            }
            z2 = iM8056ri == 1;
            if (this.f5653lr == 2) {
                z2 = !z2;
            }
            m7577ri(z2, true, i, i2, i3, i4);
        }
        InterfaceC2282ka interfaceC2282ka2 = this.f5647bu;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7737ri(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC2282ka interfaceC2282ka = this.f5647bu;
        if (interfaceC2282ka != null) {
            int[] iArrMo7740ri = interfaceC2282ka.mo7740ri(i, i2);
            m7572ri(iArrMo7740ri[0], iArrMo7740ri[1]);
        } else {
            m7572ri(i, i2);
        }
        InterfaceC2282ka interfaceC2282ka2 = this.f5647bu;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7734fi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka = this.f5647bu;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7735lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: ri */
    public int mo7581ri(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: ri */
    public int mo7582ri(View view) {
        return 0;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: ri */
    public int mo7583ri(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo7588ri()) {
            i3 = m7567ka(i, i2) ? this.f5648co : 0;
            if ((this.f5656qt & 4) <= 0) {
                return i3;
            }
            i4 = this.f5648co;
        } else {
            i3 = m7567ka(i, i2) ? this.f5658sf : 0;
            if ((this.jbs & 4) <= 0) {
                return i3;
            }
            i4 = this.f5658sf;
        }
        return i3 + i4;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: ri */
    public View mo7584ri(int i) {
        return getChildAt(i);
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: ri */
    public void mo7585ri(View view, int i, int i2, C2263ik c2263ik) {
        if (m7567ka(i, i2)) {
            if (mo7588ri()) {
                c2263ik.f5672fi += this.f5648co;
                c2263ik.f5671di += this.f5648co;
            } else {
                c2263ik.f5672fi += this.f5658sf;
                c2263ik.f5671di += this.f5658sf;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: ri */
    public void mo7586ri(C2263ik c2263ik) {
        if (mo7588ri()) {
            if ((this.f5656qt & 4) > 0) {
                c2263ik.f5672fi += this.f5648co;
                c2263ik.f5671di += this.f5648co;
                return;
            }
            return;
        }
        if ((this.jbs & 4) > 0) {
            c2263ik.f5672fi += this.f5658sf;
            c2263ik.f5671di += this.f5658sf;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m7587ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
        this.f5647bu = abstractViewOnTouchListenerC2318ik;
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    /* JADX INFO: renamed from: ri */
    public boolean mo7588ri() {
        int i = this.f5657ri;
        return i == 0 || i == 1;
    }

    public void setAlignContent(int i) {
        if (this.f5650fi != i) {
            this.f5650fi = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f5652ka != i) {
            this.f5652ka = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.xha) {
            return;
        }
        this.xha = drawable;
        if (drawable != null) {
            this.f5658sf = drawable.getIntrinsicHeight();
        } else {
            this.f5658sf = 0;
        }
        m7568lr();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f5654mj) {
            return;
        }
        this.f5654mj = drawable;
        if (drawable != null) {
            this.f5648co = drawable.getIntrinsicWidth();
        } else {
            this.f5648co = 0;
        }
        m7568lr();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.f5657ri != i) {
            this.f5657ri = i;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p093fi.InterfaceC2266ri
    public void setFlexLines(List<C2263ik> list) {
        this.slm = list;
    }

    public void setFlexWrap(int i) {
        if (this.f5653lr != i) {
            this.f5653lr = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f5651ik != i) {
            this.f5651ik = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f5649di != i) {
            this.f5649di = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.jbs) {
            this.jbs = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f5656qt) {
            this.f5656qt = i;
            requestLayout();
        }
    }
}
