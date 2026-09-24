package com.fyber.inneractive.sdk.p278ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.cache.C7900b;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.EnumC7973a;
import com.fyber.inneractive.sdk.network.C8429w0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.widget.AbstractC9279a;

/* JADX INFO: loaded from: classes4.dex */
public class FyberAdIdentifierLocal extends IFyberAdIdentifier implements View.OnClickListener {

    /* JADX INFO: renamed from: m */
    public ImageView f21390m;

    /* JADX INFO: renamed from: n */
    public TextView f21391n;

    /* JADX INFO: renamed from: o */
    public boolean f21392o;

    /* JADX INFO: renamed from: p */
    public Animator f21393p;

    /* JADX INFO: renamed from: q */
    public float f21394q;

    /* JADX INFO: renamed from: r */
    public Bitmap f21395r;

    public FyberAdIdentifierLocal(C8006r c8006r) {
        super(c8006r);
        this.f21392o = false;
        this.f21394q = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public static void m21930a(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC9279a.m22093a(imageView, null);
            return;
        }
        try {
            AbstractC9279a.m22093a(imageView, ColorStateList.valueOf(Color.parseColor(str)));
        } catch (Exception unused) {
            IAlog.m21950f("could not parse color %s", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21931a() {
        this.f21392o = false;
        this.f21390m.setImageResource(C7809R.drawable.ia_fyber_info_button);
        m21930a(this.f21390m, this.f21408g);
        Animator animator = this.f21393p;
        if (animator != null) {
            animator.removeAllListeners();
            this.f21393p = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.p278ui.IFyberAdIdentifier
    /* JADX INFO: renamed from: a */
    public final void mo21932a(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C7809R.id.ia_identifier_overlay);
        int i = 0;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(C7809R.layout.ia_layout_fyber_ad_identifier, viewGroup2, false);
        this.f21390m = (ImageView) viewGroup3.findViewById(C7809R.id.ia_fyber_identifier_image);
        TextView textView = (TextView) viewGroup3.findViewById(C7809R.id.ia_fyber_identifier_text);
        this.f21391n = textView;
        if (this.f21411j) {
            int i2 = this.f21403b;
            int i3 = this.f21404c;
            if (textView != null && textView.getLayoutParams() != null) {
                textView.getLayoutParams().width = AbstractC9174o.m21998b(i2);
                textView.getLayoutParams().height = AbstractC9174o.m21998b(i3);
            }
            ImageView imageView = this.f21390m;
            int i4 = this.f21405d;
            int i5 = this.f21406e;
            if (imageView != null && imageView.getLayoutParams() != null) {
                imageView.getLayoutParams().width = AbstractC9174o.m21998b(i4);
                imageView.getLayoutParams().height = AbstractC9174o.m21998b(i5);
            }
            TextView textView2 = this.f21391n;
            int i6 = this.f21407f;
            if (textView2 instanceof TextView) {
                textView2.setTextSize(i6);
            }
            m21930a(this.f21390m, this.f21408g);
            this.f21391n.setOnClickListener(this);
            this.f21391n.setText(this.f21409h);
            String str = this.f21410i;
            if (!TextUtils.isEmpty(str)) {
                IAConfigManager.f17654M.f17686r.m20768a(new C8429w0(new C9120a(this), viewGroup2.getContext(), new C7900b(str)));
            }
        }
        IFyberAdIdentifier.Corner corner = this.f21412k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            viewGroup3.removeView(this.f21391n);
            viewGroup3.addView(this.f21391n);
            viewGroup3.setLayoutDirection(0);
        }
        viewGroup3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC9121b(this));
        this.f21390m.setOnClickListener(this);
        m21931a();
        viewGroup2.addView(viewGroup3);
        IFyberAdIdentifier.Corner corner2 = this.f21412k;
        corner2.getClass();
        int i7 = AbstractC9131i.f21425a[corner2.ordinal()];
        if (i7 == 1) {
            i = 51;
        } else if (i7 == 2) {
            i = 53;
        } else if (i7 == 3) {
            i = 83;
        } else if (i7 == 4) {
            i = 85;
        }
        AbstractC9174o.m21994a(viewGroup3, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.f21390m) {
            if (view == this.f21391n && this.f21413l == EnumC7973a.OPEN) {
                m21931a();
                IFyberAdIdentifier.ClickListener clickListener = this.f21402a;
                if (clickListener != null) {
                    clickListener.mo20542a();
                    return;
                }
                return;
            }
            return;
        }
        if (this.f21393p != null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ImageView imageView = this.f21390m;
        Property property = View.ROTATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 90.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f21390m, "imageAlpha", 255, 25);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfInt);
        animatorSet2.addListener(new C9122c(this, animatorSet));
        animatorSet2.setDuration(225L);
        this.f21393p = animatorSet2;
        animatorSet2.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f21390m, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.f21390m, "imageAlpha", 25, 255);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat2, objectAnimatorOfInt2);
        animatorSet3.setDuration(225L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f21391n, (Property<TextView, Float>) View.TRANSLATION_X, this.f21392o ? this.f21394q : 0.0f);
        objectAnimatorOfFloat3.setDuration(450L);
        animatorSet.setDuration(450L);
        animatorSet.playTogether(objectAnimatorOfFloat3, animatorSet3);
        animatorSet.addListener(new C9126d(this));
    }
}
