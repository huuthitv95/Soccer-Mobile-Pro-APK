package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwt extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcwt(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcwt zza(Context context, View view, zzfjt zzfjtVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcwt zzcwtVar = new zzcwt(context);
        List list = zzfjtVar.zzu;
        if (!list.isEmpty() && (resources = zzcwtVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfju zzfjuVar = (zzfju) list.get(0);
            zzcwtVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfjuVar.zza * displayMetrics.density), (int) (zzfjuVar.zzb * displayMetrics.density)));
        }
        zzcwtVar.zzb = view;
        zzcwtVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcfs.zzb(zzcwtVar, zzcwtVar);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcfs.zza(zzcwtVar, zzcwtVar);
        JSONObject jSONObject = zzfjtVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcwtVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcwtVar.zzb(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcwtVar.zzb(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcwtVar.addView(relativeLayout);
        return zzcwtVar;
    }

    private final void zzb(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzc = zzc(jSONObject.optDouble("padding", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        textView.setPadding(0, iZzc, 0, iZzc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzc(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    private final int zzc(double d) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzE(this.zza, (int) d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
