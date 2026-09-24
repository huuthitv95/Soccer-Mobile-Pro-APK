package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.kc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3870kc implements InterfaceC4137wc {

    /* JADX INFO: renamed from: a */
    public Context f15060a;

    /* JADX INFO: renamed from: b */
    public final WebView f15061b;

    /* JADX INFO: renamed from: c */
    public final EnumC4049sc f15062c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4093uc f15063d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4115vc f15064e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3641ad f15065f;

    /* JADX INFO: renamed from: g */
    public InterfaceC4159xc f15066g;

    /* JADX INFO: renamed from: h */
    public C3687cd f15067h;

    /* JADX INFO: renamed from: i */
    public Boolean f15068i;

    /* JADX INFO: renamed from: j */
    public EnumC4027rc f15069j;

    /* JADX INFO: renamed from: k */
    public Float f15070k;

    /* JADX INFO: renamed from: l */
    public final Rect f15071l;

    /* JADX INFO: renamed from: m */
    public final Runnable f15072m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.kc$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15073a;

        static {
            int[] iArr = new int[EnumC4203zc.values().length];
            try {
                iArr[EnumC4203zc.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4203zc.SET_ORIENTATION_PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4203zc.UNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15073a = iArr;
        }
    }

    public C3870kc(Context context, WebView webView, EnumC4049sc placementType, InterfaceC4093uc orientationProvider, InterfaceC4115vc volumeProvider, InterfaceC3641ad synchronizerTask) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(orientationProvider, "orientationProvider");
        Intrinsics.checkNotNullParameter(volumeProvider, "volumeProvider");
        Intrinsics.checkNotNullParameter(synchronizerTask, "synchronizerTask");
        this.f15060a = context;
        this.f15061b = webView;
        this.f15062c = placementType;
        this.f15063d = orientationProvider;
        this.f15064e = volumeProvider;
        this.f15065f = synchronizerTask;
        this.f15067h = new C3687cd(context);
        this.f15071l = new Rect();
        Runnable runnable = new Runnable() { // from class: com.chartboost.sdk.impl.kc$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C3870kc.m18396a(this.f$0);
            }
        };
        this.f15072m = runnable;
        synchronizerTask.mo16819a(runnable);
    }

    public /* synthetic */ C3870kc(Context context, WebView webView, EnumC4049sc enumC4049sc, InterfaceC4093uc interfaceC4093uc, InterfaceC4115vc interfaceC4115vc, InterfaceC3641ad interfaceC3641ad, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, webView, enumC4049sc, (i & 8) != 0 ? new C3847jc(context) : interfaceC4093uc, (i & 16) != 0 ? new C3893lc(context) : interfaceC4115vc, (i & 32) != 0 ? new C3664bd(null, 0L, null, 7, null) : interfaceC3641ad);
    }

    /* JADX INFO: renamed from: a */
    public static final void m18396a(C3870kc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m18412f();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4137wc
    /* JADX INFO: renamed from: a */
    public void mo18397a() {
        this.f15065f.mo16818a();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4137wc
    /* JADX INFO: renamed from: a */
    public void mo18398a(EnumC3737eh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f15065f.cancel();
    }

    /* JADX INFO: renamed from: a */
    public final void m18399a(C4070tb c4070tb) {
        C4048sb.m19408a("MRAID command: " + c4070tb.m19465a(), (Throwable) null, 2, (Object) null);
        this.f15061b.loadUrl("javascript:" + c4070tb.m19465a());
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4137wc
    /* JADX INFO: renamed from: a */
    public void mo18400a(InterfaceC4159xc interfaceC4159xc) {
        this.f15066g = interfaceC4159xc;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18401a(Uri uri) {
        String lowerCase;
        String str = (String) m18407c(uri).get("url");
        if (str == null) {
            return false;
        }
        InterfaceC4159xc interfaceC4159xcM18405b = m18405b();
        try {
            Uri uri2 = Uri.parse(str);
            String scheme = uri2.getScheme();
            if (scheme != null) {
                lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (Intrinsics.areEqual(lowerCase, ProxyConfig.MATCH_HTTP) || Intrinsics.areEqual(lowerCase, "https")) {
                try {
                    URL url = new URL(str);
                    if (interfaceC4159xcM18405b != null) {
                        interfaceC4159xcM18405b.mo17379a(str, EnumC3787gl.MRAID_OPEN, true);
                    } else {
                        C4048sb.m19417e("MRAID open: No listener, attempting to open standard URL with Intent: " + url, null, 2, null);
                        m18410d(uri2);
                    }
                } catch (MalformedURLException e) {
                    C4048sb.m19416e("MRAID open: Malformed standard URL '" + str + "', attempting to open with Intent as fallback.", e);
                    m18410d(uri2);
                }
            } else {
                C4048sb.m19408a("MRAID open: Handling as non-standard URI (deeplink, custom scheme, etc.): " + uri2, (Throwable) null, 2, (Object) null);
                m18410d(uri2);
            }
            m18399a(C4070tb.f16330b.m19471a(EnumC4203zc.OPEN));
            return true;
        } catch (Exception e2) {
            C4048sb.m19410b("MRAID open: Failed to parse 'url' parameter value as URI: '" + str + "'", e2);
            m18399a(C4070tb.f16330b.m19471a(EnumC4203zc.OPEN));
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18402a(Uri uri, boolean z) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        try {
            int i = a.f15073a[EnumC4203zc.f17119c.m20134a(host).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return m18406b(uri);
                }
                if (i == 3) {
                    return m18408c();
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                return m18401a(uri);
            }
            C4048sb.m19417e("MRAID open command was not preceded with a recognized gesture.", null, 2, null);
            m18399a(C4070tb.f16330b.m19471a(EnumC4203zc.OPEN));
            return true;
        } catch (IllegalArgumentException e) {
            C4048sb.m19416e("Invalid MRAID command: " + host, e);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18403a(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.f15071l)) {
            return false;
        }
        long jHeight = ((long) this.f15071l.height()) * ((long) this.f15071l.width());
        if (((long) view.getHeight()) * ((long) view.getWidth()) > 0 && jHeight > 0) {
            return view.isShown();
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4137wc
    /* JADX INFO: renamed from: a */
    public boolean mo18404a(WebResourceRequest request, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        String scheme = url.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != -1368728362) {
                if (iHashCode == 104156535 && scheme.equals(CampaignEx.JSON_KEY_MRAID)) {
                    Intrinsics.checkNotNull(url);
                    return m18402a(url, z2);
                }
            } else if (scheme.equals("cb-log")) {
                String string = url.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                C4048sb.m19413c(string, null, 2, null);
                return true;
            }
        }
        if (z) {
            return false;
        }
        try {
            URL url2 = new URL(url.toString());
            InterfaceC4159xc interfaceC4159xcM18405b = m18405b();
            if (interfaceC4159xcM18405b != null) {
                interfaceC4159xcM18405b.mo17379a(url2.toString(), EnumC3787gl.WEBVIEW_CLICK, z2);
            }
        } catch (MalformedURLException e) {
            C4048sb.m19407a("WebView click: Malformed or non-standard URL '" + url + "', attempting to open with Intent.", e);
            Intrinsics.checkNotNull(url);
            m18410d(url);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC4159xc m18405b() {
        return this.f15066g;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18406b(Uri uri) {
        EnumC3895le enumC3895le;
        Intrinsics.checkNotNullParameter(uri, "uri");
        InterfaceC4159xc interfaceC4159xcM18405b = m18405b();
        if (interfaceC4159xcM18405b == null) {
            return false;
        }
        Map mapM18407c = m18407c(uri);
        String str = (String) mapM18407c.get("forceOrientation");
        if (str == null) {
            return false;
        }
        String str2 = (String) mapM18407c.get("allowOrientationChange");
        boolean z = str2 != null ? Boolean.parseBoolean(str2) : true;
        if (Intrinsics.areEqual(str, C11744X3.i.f26320C)) {
            enumC3895le = EnumC3895le.LANDSCAPE_ONLY;
        } else if (Intrinsics.areEqual(str, C11744X3.i.f26322D)) {
            enumC3895le = EnumC3895le.PORTRAIT_ONLY;
        } else {
            enumC3895le = z ? EnumC3895le.ENABLE_ORIENTATION_CHANGE : EnumC3895le.DISABLE_ORIENTATION_CHANGE;
        }
        interfaceC4159xcM18405b.mo17381b(enumC3895le);
        m18399a(C4070tb.f16330b.m19471a(EnumC4203zc.SET_ORIENTATION_PROPERTIES));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final Map m18407c(Uri uri) {
        List listSplit$default;
        String query = uri.getQuery();
        if (query == null || (listSplit$default = StringsKt.split$default((CharSequence) query, new String[]{C11744X3.j.f26436c}, false, 0, 6, (Object) null)) == null) {
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10)), 16));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt.split$default((CharSequence) it.next(), new String[]{C11744X3.j.f26434b}, false, 2, 2, (Object) null);
            Pair pairM43482to = TuplesKt.m43482to((String) listSplit$default2.get(0), listSplit$default2.size() > 1 ? (String) listSplit$default2.get(1) : "");
            linkedHashMap.put(pairM43482to.getFirst(), pairM43482to.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18408c() {
        InterfaceC4159xc interfaceC4159xcM18405b = m18405b();
        if (interfaceC4159xcM18405b == null) {
            return false;
        }
        interfaceC4159xcM18405b.mo17378a(EnumC3833il.MRAID_UNLOAD);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m18409d() {
        if (this.f15067h.m17160a().m17283a()) {
            m18399a(C4070tb.f16330b.m19476b(this.f15067h));
        }
        if (this.f15067h.m17164b().m17283a()) {
            m18399a(C4070tb.f16330b.m19478c(this.f15067h));
        }
        if (this.f15067h.m17167c().m17283a()) {
            C4070tb.a aVar = C4070tb.f16330b;
            m18399a(aVar.m19479d(this.f15067h));
            m18399a(aVar.m19467a(this.f15067h));
        }
        if (this.f15067h.m17168d().m17283a()) {
            m18399a(C4070tb.f16330b.m19480e(this.f15067h));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18410d(Uri uri) {
        C4048sb.m19408a("Attempting to open URI with Intent: " + uri, (Throwable) null, 2, (Object) null);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        try {
            this.f15060a.startActivity(intent);
            C4048sb.m19408a("Successfully started activity for URI: " + uri, (Throwable) null, 2, (Object) null);
            InterfaceC4159xc interfaceC4159xcM18405b = m18405b();
            if (interfaceC4159xcM18405b != null) {
                interfaceC4159xcM18405b.mo17379a(null, EnumC3787gl.WEBVIEW_CLICK, true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            C4048sb.m19416e("No activity found to handle URI: " + uri + ". Cannot open.", e);
            return false;
        } catch (SecurityException e2) {
            C4048sb.m19410b("Security exception trying to open URI: " + uri, e2);
            return false;
        } catch (Exception e3) {
            C4048sb.m19410b("Unexpected error trying to open URI: " + uri, e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18411e() {
        C4070tb.a aVar = C4070tb.f16330b;
        m18399a(aVar.m19475b());
        m18399a(aVar.m19477b("9.11.1"));
        m18399a(aVar.m19469a(this.f15062c));
        m18399a(aVar.m19470a(EnumC4071tc.DEFAULT));
        m18412f();
        m18399a(aVar.m19466a());
        this.f15065f.start();
    }

    /* JADX INFO: renamed from: f */
    public final void m18412f() {
        EnumC4027rc enumC4027rcMo18205a = this.f15063d.mo18205a();
        if (enumC4027rcMo18205a != null && enumC4027rcMo18205a != this.f15069j) {
            this.f15069j = enumC4027rcMo18205a;
            m18399a(C4070tb.f16330b.m19468a(enumC4027rcMo18205a, this.f15063d.isLocked()));
        }
        this.f15067h.m17163a(this.f15061b);
        m18409d();
        Float fMo18503a = this.f15064e.mo18503a();
        if (!Intrinsics.areEqual(fMo18503a, this.f15070k)) {
            this.f15070k = fMo18503a;
            m18399a(C4070tb.f16330b.m19472a(fMo18503a));
        }
        boolean zM18403a = m18403a(this.f15061b);
        if (Intrinsics.areEqual(Boolean.valueOf(zM18403a), this.f15068i)) {
            return;
        }
        this.f15068i = Boolean.valueOf(zM18403a);
        m18399a(C4070tb.f16330b.m19474a(zM18403a));
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4137wc
    public void pause() {
        this.f15065f.pause();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4137wc
    public void start() {
        m18411e();
    }
}
