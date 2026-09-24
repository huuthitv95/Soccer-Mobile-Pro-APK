package com.applovin.mediation.nativeAds;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.C1549f3;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.mediation.ads.C1645b;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.C1846R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final View f4152a;

    /* JADX INFO: renamed from: b */
    private final TextView f4153b;

    /* JADX INFO: renamed from: c */
    private final TextView f4154c;

    /* JADX INFO: renamed from: d */
    private final TextView f4155d;

    /* JADX INFO: renamed from: e */
    private final Button f4156e;

    /* JADX INFO: renamed from: f */
    private final ImageView f4157f;

    /* JADX INFO: renamed from: g */
    private final FrameLayout f4158g;

    /* JADX INFO: renamed from: h */
    private final ViewGroup f4159h;

    /* JADX INFO: renamed from: i */
    private final FrameLayout f4160i;

    /* JADX INFO: renamed from: j */
    private final ViewGroup f4161j;

    /* JADX INFO: renamed from: k */
    private final ViewGroup f4162k;

    /* JADX INFO: renamed from: l */
    private final FrameLayout f4163l;

    /* JADX INFO: renamed from: m */
    private C1645b f4164m;

    /* JADX INFO: renamed from: com.applovin.mediation.nativeAds.MaxNativeAdView$a */
    class ViewTreeObserverOnPreDrawListenerC1841a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WeakReference f4165a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewGroup f4166b;

        ViewTreeObserverOnPreDrawListenerC1841a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f4165a = weakReference;
            this.f4166b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4165a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                C1748l.f3003E0.m4782Q();
                if (C1768p.m5160a()) {
                    C1748l.f3003E0.m4782Q().m5178k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f4165a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4166b.getLayoutParams();
            layoutParams.height = ((View) this.f4166b.getParent()).getWidth();
            this.f4166b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f4152a = view;
        } else {
            this.f4152a = LayoutInflater.from(context).inflate(z ? m5790a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, (ViewGroup) this, false);
        }
        addView(this.f4152a);
        this.f4153b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f4154c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f4155d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f4156e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f4157f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f4158g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f4159h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f4160i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f4161j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f4162k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f4163l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            m5795b(maxNativeAd);
        }
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(C1846R.id.applovin_native_title_text_view).setAdvertiserTextViewId(C1846R.id.applovin_native_advertiser_text_view).setBodyTextViewId(C1846R.id.applovin_native_body_text_view).setCallToActionButtonId(C1846R.id.applovin_native_cta_button).setIconImageViewId(C1846R.id.applovin_native_icon_image_view).setIconContentViewId(C1846R.id.applovin_native_icon_view).setOptionsContentViewGroupId(C1846R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(C1846R.id.applovin_native_options_view).setStarRatingContentViewGroupId(C1846R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(C1846R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(C1846R.id.applovin_native_media_content_view).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    /* JADX INFO: renamed from: a */
    private int m5790a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return C1846R.layout.max_native_ad_vertical_banner_view;
            }
            if ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) {
                return C1846R.layout.max_native_ad_media_banner_view;
            }
            return "vertical_media_banner_template".equals(str) ? C1846R.layout.max_native_ad_vertical_media_banner_view : C1846R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? C1846R.layout.max_native_ad_vertical_leader_view : C1846R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return C1846R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid template: " + str);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5791a() {
        setSelected(true);
    }

    /* JADX INFO: renamed from: a */
    private void m5792a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f4153b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f4155d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f4154c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f4156e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f4157f;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable(null);
            } else if (icon.getDrawable() != null) {
                this.f4157f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                ImageViewUtils.setAndDownscaleImageUri(this.f4157f, icon.getUri());
            } else {
                this.f4157f.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f4162k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4162k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f4159h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4159h.addView(optionsView);
                this.f4159h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f4161j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4161j.addView(appLovinStarRatingView);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5794b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(C1846R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1841a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m5795b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f4153b.setText(maxNativeAd.getTitle());
        } else {
            this.f4153b.setVisibility(8);
        }
        if (this.f4154c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f4154c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f4154c.setVisibility(8);
            }
        }
        if (this.f4155d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f4155d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f4155d.setVisibility(8);
            } else {
                this.f4155d.setVisibility(4);
            }
        }
        if (this.f4156e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f4156e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f4156e.setVisibility(8);
            } else {
                this.f4156e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f4158g;
        if (frameLayout != null) {
            if (icon == null || this.f4157f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f4158g.removeAllViews();
                    this.f4158g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f4157f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f4158g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f4157f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f4160i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f4160i.addView(optionsView);
            this.f4160i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f4163l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4163l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f4163l.setVisibility(8);
            }
        }
        if (this.f4161j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f4161j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f4161j.addView(appLovinStarRatingView);
            } else {
                this.f4161j.setVisibility(8);
            }
        }
        m5794b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5791a();
            }
        }, 2000L);
    }

    public C1645b getAdViewTracker() {
        return this.f4164m;
    }

    public TextView getAdvertiserTextView() {
        return this.f4154c;
    }

    public TextView getBodyTextView() {
        return this.f4155d;
    }

    public Button getCallToActionButton() {
        return this.f4156e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f4153b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f4154c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f4155d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f4156e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f4157f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f4158g;
    }

    public ImageView getIconImageView() {
        return this.f4157f;
    }

    public View getMainView() {
        return this.f4152a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f4163l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f4162k;
        return viewGroup != null ? viewGroup : this.f4163l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f4160i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f4159h;
        return viewGroup != null ? viewGroup : this.f4160i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f4161j;
    }

    public TextView getTitleTextView() {
        return this.f4153b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1645b c1645b = this.f4164m;
        if (c1645b != null) {
            c1645b.m3413c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        C1768p.m5169j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        C1645b c1645b = this.f4164m;
        if (c1645b != null) {
            c1645b.m3411a();
            this.f4164m = null;
        }
        View view = this.f4152a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f4152a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f4152a);
    }

    public void render(C1549f3 c1549f3, AbstractC1644a.a aVar, C1748l c1748l) {
        recycle();
        if (!c1549f3.m2579y0().get() || !c1549f3.m2578x0().get()) {
            this.f4164m = new C1645b(c1549f3, this, aVar, c1748l);
        }
        final MaxNativeAd nativeAd = c1549f3.getNativeAd();
        if (c1549f3.m2580z0() && nativeAd.isContainerClickable()) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            c1748l.m4782Q().m5171a("MaxNativeAdView", "Rendering custom ad view");
        }
        m5792a(nativeAd);
    }
}
