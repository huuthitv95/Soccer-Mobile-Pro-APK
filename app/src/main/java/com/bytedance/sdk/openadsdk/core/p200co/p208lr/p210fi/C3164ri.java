package com.bytedance.sdk.openadsdk.core.p200co.p208lr.p210fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.InterfaceC2282ka;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import com.bytedance.adsdk.ugeno.yoga.p111lr.C2356ik;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.fi.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3164ri extends FrameLayout {

    /* JADX INFO: renamed from: ik */
    private final ri f10415ik;

    /* JADX INFO: renamed from: ka */
    private InterfaceC2282ka f10416ka;

    /* JADX INFO: renamed from: lr */
    private final List<AbstractViewOnTouchListenerC2318ik> f10417lr;

    /* JADX INFO: renamed from: ri */
    private final RecyclerView f10418ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.fi.ri$lr */
    private static class lr extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: ri */
        private final ViewGroup f10419ri;

        public lr(View view) {
            super(view);
            this.f10419ri = (ViewGroup) view;
        }

        /* JADX INFO: renamed from: ri */
        public void m13208ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik) {
            View viewM7879sf = abstractViewOnTouchListenerC2318ik.m7879sf();
            ViewParent parent = viewM7879sf.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewM7879sf);
            }
            this.f10419ri.removeAllViews();
            this.f10419ri.addView(viewM7879sf, new C2356ik.ri(abstractViewOnTouchListenerC2318ik.m7857pv(), abstractViewOnTouchListenerC2318ik.m7842ig()));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.lr.fi.ri$ri */
    private class ri extends RecyclerView.Adapter<lr> {
        private ri() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return C3164ri.this.f10417lr.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public lr onCreateViewHolder(ViewGroup viewGroup, int i) {
            C2356ik c2356ik = new C2356ik(viewGroup.getContext());
            AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik = (AbstractViewOnTouchListenerC2318ik) C3164ri.this.f10417lr.get(i);
            c2356ik.setLayoutParams(new ViewGroup.LayoutParams(abstractViewOnTouchListenerC2318ik.m7857pv(), abstractViewOnTouchListenerC2318ik.m7842ig()));
            return new lr(c2356ik);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(lr lrVar, int i) {
            lrVar.m13208ri((AbstractViewOnTouchListenerC2318ik) C3164ri.this.f10417lr.get(i));
        }
    }

    public C3164ri(Context context) {
        super(context);
        this.f10417lr = new CopyOnWriteArrayList();
        ri riVar = new ri();
        this.f10415ik = riVar;
        RecyclerView recyclerView = new RecyclerView(context);
        this.f10418ri = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(riVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2282ka interfaceC2282ka = this.f10416ka;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC2282ka interfaceC2282ka = this.f10416ka;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7698mj();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC2282ka interfaceC2282ka = this.f10416ka;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7733di();
        }
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka2 = this.f10416ka;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7737ri(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        InterfaceC2282ka interfaceC2282ka = this.f10416ka;
        if (interfaceC2282ka != null) {
            int[] iArrMo7740ri = interfaceC2282ka.mo7740ri(i, i2);
            super.onMeasure(iArrMo7740ri[0], iArrMo7740ri[1]);
        } else {
            super.onMeasure(i, i2);
        }
        InterfaceC2282ka interfaceC2282ka2 = this.f10416ka;
        if (interfaceC2282ka2 != null) {
            interfaceC2282ka2.mo7734fi();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC2282ka interfaceC2282ka = this.f10416ka;
        if (interfaceC2282ka != null) {
            interfaceC2282ka.mo7735lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: ri */
    public void m13205ri(InterfaceC2282ka interfaceC2282ka) {
        this.f10416ka = interfaceC2282ka;
    }

    /* JADX INFO: renamed from: ri */
    public void m13206ri(AbstractViewOnTouchListenerC2318ik<View> abstractViewOnTouchListenerC2318ik) {
        if (abstractViewOnTouchListenerC2318ik == null) {
            return;
        }
        this.f10417lr.add(abstractViewOnTouchListenerC2318ik);
        ri riVar = this.f10415ik;
        if (riVar != null) {
            riVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m13207ri(C3163lr c3163lr) {
        ViewGroup.LayoutParams layoutParams = this.f10418ri.getLayoutParams();
        layoutParams.width = c3163lr.m7857pv();
        layoutParams.height = c3163lr.m7842ig();
        this.f10418ri.setLayoutParams(layoutParams);
    }

    public void setOrientation(int i) {
        if (i == 1) {
            this.f10418ri.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.f10418ri.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }
}
