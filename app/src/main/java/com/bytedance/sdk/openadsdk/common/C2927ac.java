package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.core.p217di.C3191fi;
import com.bytedance.sdk.openadsdk.core.p217di.C3192ik;
import com.bytedance.sdk.openadsdk.core.p217di.C3195mj;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ac */
/* JADX INFO: loaded from: classes3.dex */
public class C2927ac extends C3192ik {

    /* JADX INFO: renamed from: ik */
    private ri f8748ik;

    /* JADX INFO: renamed from: ka */
    private boolean f8749ka;

    /* JADX INFO: renamed from: lr */
    private LinearLayout f8750lr;

    /* JADX INFO: renamed from: ri */
    private Context f8751ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.common.ac$ri */
    public interface ri {
        /* JADX INFO: renamed from: ik */
        void mo10652ik();

        /* JADX INFO: renamed from: ka */
        void mo10653ka();

        /* JADX INFO: renamed from: lr */
        void mo10654lr();

        /* JADX INFO: renamed from: ri */
        void mo10655ri();
    }

    public C2927ac(Context context, boolean z) {
        super(context);
        this.f8751ri = context;
        this.f8749ka = z;
        m11233lr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: di */
    public /* synthetic */ void m11229di(View view) {
        m11239ri();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public /* synthetic */ void m11230fi(View view) {
        ri riVar = this.f8748ik;
        if (riVar != null) {
            riVar.mo10655ri();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public /* synthetic */ void m11231ik(View view) {
        ri riVar = this.f8748ik;
        if (riVar != null) {
            riVar.mo10652ik();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ka */
    public /* synthetic */ void m11232ka(View view) {
        ri riVar = this.f8748ik;
        if (riVar != null) {
            riVar.mo10654lr();
        }
    }

    /* JADX INFO: renamed from: lr */
    private void m11233lr() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.common.ac$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.m11238ri(view, motionEvent);
            }
        });
        LinearLayout linearLayout = new LinearLayout(this.f8751ri);
        this.f8750lr = linearLayout;
        linearLayout.setOrientation(1);
        this.f8750lr.setGravity(80);
        this.f8750lr.setPadding(m11235ri(16.0f), 0, m11235ri(16.0f), m11235ri(58.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m11235ri(16.0f));
        gradientDrawable.setColor(Color.parseColor("#E1E1E1"));
        this.f8750lr.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = m11235ri(16.0f);
        this.f8750lr.setLayoutParams(layoutParams);
        C3192ik c3192ik = new C3192ik(this.f8751ri);
        c3192ik.setPadding(m11235ri(6.0f), 0, m11235ri(6.0f), 0);
        c3192ik.setLayoutParams(new LinearLayout.LayoutParams(-1, m11235ri(44.0f)));
        C3195mj c3195mj = new C3195mj(this.f8751ri);
        Context context = this.f8751ri;
        c3195mj.setText(context.getString(C2729uq.m10307lr(context, "tt_more_title")));
        c3195mj.setTextColor(Color.parseColor("#000000"));
        c3195mj.setTextSize(2, 17.0f);
        c3195mj.setGravity(17);
        c3195mj.setTypeface(Typeface.defaultFromStyle(1));
        c3192ik.addView(c3195mj, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(this.f8751ri);
        imageView.setImageResource(C2729uq.m10305ka(this.f8751ri, "tt_titlebar_close_drawable"));
        imageView.setPadding(m11235ri(10.0f), m11235ri(10.0f), m11235ri(10.0f), m11235ri(10.0f));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ac$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m11229di(view);
            }
        });
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m11235ri(44.0f), m11235ri(44.0f));
        layoutParams2.gravity = 8388629;
        c3192ik.addView(imageView, layoutParams2);
        this.f8750lr.addView(c3192ik);
        C3191fi c3191fiM11236ri = m11236ri(8);
        Context context2 = this.f8751ri;
        m11237ri(c3191fiM11236ri, context2.getString(C2729uq.m10307lr(context2, "tt_more_retry")), "tt_more_retry_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ac$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m11230fi(view);
            }
        });
        Context context3 = this.f8751ri;
        m11237ri(c3191fiM11236ri, context3.getString(C2729uq.m10307lr(context3, "tt_more_copy_link")), "tt_more_copy_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ac$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m11232ka(view);
            }
        });
        Context context4 = this.f8751ri;
        m11237ri(c3191fiM11236ri, context4.getString(C2729uq.m10307lr(context4, "tt_more_open_browser")), "tt_more_browser_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ac$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m11231ik(view);
            }
        });
        this.f8750lr.addView(c3191fiM11236ri);
        C3191fi c3191fiM11236ri2 = m11236ri(8);
        Context context5 = this.f8751ri;
        m11237ri(c3191fiM11236ri2, context5.getString(C2729uq.m10307lr(context5, "tt_more_report")), "tt_more_report_icon", new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.ac$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m11234lr(view);
            }
        });
        this.f8750lr.addView(c3191fiM11236ri2);
        addView(this.f8750lr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public /* synthetic */ void m11234lr(View view) {
        ri riVar = this.f8748ik;
        if (riVar != null) {
            riVar.mo10653ka();
        }
    }

    /* JADX INFO: renamed from: ri */
    private int m11235ri(float f) {
        return C3583qd.m16589lr(this.f8751ri, f);
    }

    /* JADX INFO: renamed from: ri */
    private C3191fi m11236ri(int i) {
        C3191fi c3191fi = new C3191fi(this.f8751ri);
        c3191fi.setOrientation(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m11235ri(i));
        gradientDrawable.setColor(-1);
        c3191fi.setBackgroundDrawable(gradientDrawable);
        c3191fi.setPadding(m11235ri(8.0f), m11235ri(8.0f), m11235ri(8.0f), m11235ri(8.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m11235ri(8.0f);
        c3191fi.setLayoutParams(layoutParams);
        return c3191fi;
    }

    /* JADX INFO: renamed from: ri */
    private void m11237ri(C3191fi c3191fi, String str, String str2, View.OnClickListener onClickListener) {
        C3191fi c3191fi2 = new C3191fi(this.f8751ri);
        c3191fi2.setOrientation(0);
        c3191fi2.setGravity(16);
        c3191fi2.setOnClickListener(onClickListener);
        ImageView imageView = new ImageView(this.f8751ri);
        imageView.setImageResource(C2729uq.m10305ka(this.f8751ri, str2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m11235ri(20.0f), m11235ri(20.0f));
        layoutParams.setMargins(m11235ri(16.0f), m11235ri(0.0f), m11235ri(16.0f), m11235ri(0.0f));
        c3191fi2.addView(imageView, layoutParams);
        C3195mj c3195mj = new C3195mj(this.f8751ri);
        c3195mj.setText(str);
        c3195mj.setTextColor(Color.parseColor("#000000"));
        c3195mj.setTextSize(2, 16.0f);
        c3195mj.setGravity(8388627);
        c3195mj.setTypeface(Typeface.defaultFromStyle(0));
        c3191fi2.addView(c3195mj, new LinearLayout.LayoutParams(-2, -2));
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, m11235ri(52.0f));
        if (c3191fi.getChildCount() > 0) {
            View view = new View(this.f8751ri);
            view.setBackgroundColor(Color.parseColor("#1F000000"));
            c3191fi.addView(view, new LinearLayout.LayoutParams(-1, m11235ri(1.0f)));
        }
        c3191fi.addView(c3191fi2, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public /* synthetic */ boolean m11238ri(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            Rect rect = new Rect();
            this.f8750lr.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                m11239ri();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public void m11239ri() {
        setVisibility(8);
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m11240ri(View view) {
        View viewFindViewById = view.getRootView().findViewById(R.id.content);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (getParent() == null) {
            ((ViewGroup) viewFindViewById).addView(this, layoutParams);
        }
        setVisibility(0);
    }

    public void setOnMenuItemClickListener(ri riVar) {
        this.f8748ik = riVar;
    }
}
