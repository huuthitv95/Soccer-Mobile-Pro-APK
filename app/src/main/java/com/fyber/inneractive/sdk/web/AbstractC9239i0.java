package com.fyber.inneractive.sdk.web;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.measurement.C8271e;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.measurement.tracker.C8276a;
import com.fyber.inneractive.sdk.measurement.tracker.C8277b;
import com.fyber.inneractive.sdk.measurement.tracker.EnumC8279d;
import com.fyber.inneractive.sdk.mraid.C8319a0;
import com.fyber.inneractive.sdk.mraid.C8323c0;
import com.fyber.inneractive.sdk.mraid.C8325d0;
import com.fyber.inneractive.sdk.mraid.C8331g0;
import com.fyber.inneractive.sdk.mraid.C8348x;
import com.fyber.inneractive.sdk.mraid.C8350z;
import com.fyber.inneractive.sdk.mraid.EnumC8329f0;
import com.fyber.inneractive.sdk.mraid.EnumC8335k;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8424u;
import com.fyber.inneractive.sdk.p278ui.IAcloseButton;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.rtb.watermark.C9111b;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.C9155h1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.Partner;
import com.ironsource.C11744X3;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.i0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9239i0 extends AbstractC9240i1 {

    /* JADX INFO: renamed from: q0 */
    public static final String[] f21584q0 = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* JADX INFO: renamed from: N */
    public EnumC8329f0 f21585N;

    /* JADX INFO: renamed from: O */
    public final EnumC9277z f21586O;

    /* JADX INFO: renamed from: P */
    public final EnumC9224d0 f21587P;

    /* JADX INFO: renamed from: Q */
    public final EnumC9221c0 f21588Q;

    /* JADX INFO: renamed from: R */
    public ViewGroup f21589R;

    /* JADX INFO: renamed from: S */
    public C9248m f21590S;

    /* JADX INFO: renamed from: T */
    public boolean f21591T;

    /* JADX INFO: renamed from: U */
    public int f21592U;

    /* JADX INFO: renamed from: V */
    public C9227e0 f21593V;

    /* JADX INFO: renamed from: W */
    public IAcloseButton f21594W;

    /* JADX INFO: renamed from: X */
    public boolean f21595X;

    /* JADX INFO: renamed from: Y */
    public float f21596Y;

    /* JADX INFO: renamed from: Z */
    public int f21597Z;

    /* JADX INFO: renamed from: a0 */
    public int f21598a0;

    /* JADX INFO: renamed from: b0 */
    public int f21599b0;

    /* JADX INFO: renamed from: c0 */
    public int f21600c0;

    /* JADX INFO: renamed from: d0 */
    public int f21601d0;

    /* JADX INFO: renamed from: e0 */
    public int f21602e0;

    /* JADX INFO: renamed from: f0 */
    public Orientation f21603f0;

    /* JADX INFO: renamed from: g0 */
    public int f21604g0;

    /* JADX INFO: renamed from: h0 */
    public FrameLayout f21605h0;

    /* JADX INFO: renamed from: i0 */
    public FrameLayout f21606i0;

    /* JADX INFO: renamed from: j0 */
    public FrameLayout f21607j0;

    /* JADX INFO: renamed from: k0 */
    public int f21608k0;

    /* JADX INFO: renamed from: l0 */
    public int f21609l0;

    /* JADX INFO: renamed from: m0 */
    public C9265t f21610m0;

    /* JADX INFO: renamed from: n0 */
    public final ViewTreeObserverOnPreDrawListenerC9254p f21611n0;

    /* JADX INFO: renamed from: o0 */
    public C9111b f21612o0;

    /* JADX INFO: renamed from: p0 */
    public C9155h1 f21613p0;

    public AbstractC9239i0(boolean z, EnumC9221c0 enumC9221c0, EnumC9277z enumC9277z, EnumC9224d0 enumC9224d0, C8271e c8271e, C8006r c8006r) {
        super(z, enumC9221c0, c8006r);
        this.f21585N = EnumC8329f0.HIDDEN;
        this.f21591T = false;
        this.f21597Z = -1;
        this.f21598a0 = -1;
        this.f21599b0 = -1;
        this.f21600c0 = -1;
        this.f21601d0 = -1;
        this.f21602e0 = -1;
        this.f21603f0 = Orientation.NONE;
        this.f21621H = c8271e;
        this.f21588Q = enumC9221c0;
        this.f21586O = enumC9277z;
        this.f21587P = enumC9224d0;
        this.f21611n0 = new ViewTreeObserverOnPreDrawListenerC9254p(this);
    }

    /* JADX INFO: renamed from: a */
    public static Date m22065a(String str) {
        Date date = null;
        int i = 0;
        while (true) {
            String[] strArr = f21584q0;
            if (i >= 2) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i], Locale.getDefault()).parse(str);
                if (date != null) {
                    break;
                }
                i++;
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m22066a(Map map) {
        String str;
        HashMap map2 = new HashMap();
        if (!map.containsKey("description") || !map.containsKey("start")) {
            throw new IllegalArgumentException("Missing start and description fields");
        }
        map2.put("title", map.get("description"));
        if (!map.containsKey("start") || map.get("start") == null) {
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        Date dateM22065a = m22065a((String) map.get("start"));
        if (dateM22065a == null) {
            throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
        }
        map2.put("beginTime", Long.valueOf(dateM22065a.getTime()));
        if (map.containsKey("end") && map.get("end") != null) {
            Date dateM22065a2 = m22065a((String) map.get("end"));
            if (dateM22065a2 == null) {
                throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            map2.put(SDKConstants.PARAM_END_TIME, Long.valueOf(dateM22065a2.getTime()));
        }
        if (map.containsKey(FirebaseAnalytics.Param.LOCATION)) {
            map2.put("eventLocation", map.get(FirebaseAnalytics.Param.LOCATION));
        }
        if (map.containsKey("summary")) {
            map2.put("description", map.get("summary"));
        }
        if (map.containsKey("transparency")) {
            map2.put("availability", Integer.valueOf(C11744X3.i.f26348T.equals(map.get("transparency")) ? 1 : 0));
        }
        StringBuilder sb = new StringBuilder();
        if (map.containsKey("frequency")) {
            String str2 = (String) map.get("frequency");
            int i = map.containsKey("interval") ? Integer.parseInt((String) map.get("interval")) : -1;
            if ("daily".equals(str2)) {
                sb.append("FREQ=DAILY;");
                if (i != -1) {
                    sb.append("INTERVAL=" + i + ";");
                }
            } else {
                if ("weekly".equals(str2)) {
                    sb.append("FREQ=WEEKLY;");
                    if (i != -1) {
                        sb.append("INTERVAL=" + i + ";");
                    }
                    if (map.containsKey("daysInWeek")) {
                        String str3 = (String) map.get("daysInWeek");
                        StringBuilder sb2 = new StringBuilder();
                        boolean[] zArr = new boolean[7];
                        String[] strArrSplit = str3.split(",");
                        for (String str4 : strArrSplit) {
                            int i2 = Integer.parseInt(str4);
                            if (i2 == 7) {
                                i2 = 0;
                            }
                            if (!zArr[i2]) {
                                StringBuilder sb3 = new StringBuilder();
                                switch (i2) {
                                    case 0:
                                        str = "SU";
                                        break;
                                    case 1:
                                        str = "MO";
                                        break;
                                    case 2:
                                        str = "TU";
                                        break;
                                    case 3:
                                        str = "WE";
                                        break;
                                    case 4:
                                        str = "TH";
                                        break;
                                    case 5:
                                        str = "FR";
                                        break;
                                    case 6:
                                        str = "SA";
                                        break;
                                    default:
                                        throw new IllegalArgumentException(AbstractC8673m.m21221a("invalid day of week ", i2));
                                }
                                sb3.append(str);
                                sb3.append(",");
                                sb2.append(sb3.toString());
                                zArr[i2] = true;
                            }
                        }
                        if (strArrSplit.length == 0) {
                            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                        }
                        sb2.deleteCharAt(sb2.length() - 1);
                        String string = sb2.toString();
                        if (string == null) {
                            throw new IllegalArgumentException("invalid ");
                        }
                        sb.append("BYDAY=" + string + ";");
                    }
                } else {
                    if (!"monthly".equals(str2)) {
                        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                    }
                    sb.append("FREQ=MONTHLY;");
                    if (i != -1) {
                        sb.append("INTERVAL=" + i + ";");
                    }
                    if (map.containsKey("daysInMonth")) {
                        String str5 = (String) map.get("daysInMonth");
                        StringBuilder sb4 = new StringBuilder();
                        boolean[] zArr2 = new boolean[63];
                        String[] strArrSplit2 = str5.split(",");
                        for (String str6 : strArrSplit2) {
                            int i3 = Integer.parseInt(str6);
                            int i4 = i3 + 31;
                            if (!zArr2[i4]) {
                                StringBuilder sb5 = new StringBuilder();
                                if (i3 == 0 || i3 < -31 || i3 > 31) {
                                    throw new IllegalArgumentException(AbstractC8673m.m21221a("invalid day of month ", i3));
                                }
                                sb5.append("" + i3);
                                sb5.append(",");
                                sb4.append(sb5.toString());
                                zArr2[i4] = true;
                            }
                        }
                        if (strArrSplit2.length == 0) {
                            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                        }
                        sb4.deleteCharAt(sb4.length() - 1);
                        String string2 = sb4.toString();
                        if (string2 == null) {
                            throw new IllegalArgumentException();
                        }
                        sb.append("BYMONTHDAY=" + string2 + ";");
                    }
                }
            }
        }
        String string3 = sb.toString();
        if (!TextUtils.isEmpty(string3)) {
            map2.put("rrule", string3);
        }
        return map2;
    }

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap m22067a(URI uri) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split(C11744X3.j.f26436c)) {
                int iIndexOf = str.indexOf(C11744X3.j.f26434b);
                linkedHashMap.put(iIndexOf > 0 ? URLDecoder.decode(str.substring(0, iIndexOf), "UTF-8") : str, (iIndexOf <= 0 || str.length() <= (i = iIndexOf + 1)) ? null : URLDecoder.decode(str.substring(i), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9240i1
    /* JADX INFO: renamed from: a */
    public final void mo22068a(Context context, boolean z) {
        Window window;
        Window window2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) IAConfigManager.f17654M.f17689u.m20436a().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.f21596Y = displayMetrics.density;
        Rect rect = new Rect();
        boolean z2 = context instanceof Activity;
        if (z2 && (window2 = ((Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i = rect.top;
        View viewFindViewById = (!z2 || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(R.id.content);
        int top = viewFindViewById != null ? viewFindViewById.getTop() - i : 0;
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        double d = i2;
        double d2 = 160.0d / ((double) displayMetrics.densityDpi);
        int widthDp = (int) (d2 * d);
        int heightDp = (int) (d2 * ((double) i3));
        int i4 = (i3 - i) - top;
        C9248m c9248m = this.f21565b;
        if (c9248m == null || c9248m.getScaleX() == 1.0f || this.f21565b.getScaleY() == 1.0f) {
            double d3 = 160.0d / ((double) displayMetrics.densityDpi);
            this.f21599b0 = (int) (d * d3);
            this.f21600c0 = (int) (d3 * ((double) i4));
        } else {
            widthDp = this.f21565b.getWidthDp();
            heightDp = this.f21565b.getHeightDp();
            int iM21998b = (AbstractC9174o.m21998b(this.f21565b.getHeightDp()) - i) - top;
            this.f21599b0 = this.f21597Z;
            this.f21600c0 = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * ((double) iM21998b));
        }
        if (this.f21597Z == widthDp && this.f21598a0 == heightDp) {
            return;
        }
        this.f21597Z = widthDp;
        this.f21598a0 = heightDp;
        if (z) {
            m22081a(new C8323c0(widthDp, heightDp));
            m22081a(new C8319a0(this.f21599b0, this.f21600c0));
            m22081a(new C8350z(this.f21599b0, this.f21600c0));
            int i5 = this.f21601d0;
            if (i5 > 0 && this.f21602e0 > 0) {
                m22081a(new C8348x(AbstractC9174o.m22001c(i5), AbstractC9174o.m22001c(this.f21602e0)));
                return;
            }
            C9248m c9248m2 = this.f21565b;
            if (c9248m2 == null || c9248m2.getWidth() <= 0 || this.f21565b.getHeight() <= 0) {
                return;
            }
            m22081a(new C8348x(AbstractC9174o.m22001c(this.f21565b.getWidth()), AbstractC9174o.m22001c(this.f21565b.getHeight())));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22069a(View view, EnumC8279d enumC8279d) {
        AbstractC8280e abstractC8280e;
        if (view == null || (abstractC8280e = this.f21622I) == null) {
            return;
        }
        abstractC8280e.getClass();
        try {
            AdSession adSession = abstractC8280e.f18458a;
            if (adSession != null) {
                if (enumC8279d == EnumC8279d.CloseButton) {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.CLOSE_AD, enumC8279d.name());
                } else if (enumC8279d == EnumC8279d.Watermark) {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.NOT_VISIBLE, enumC8279d.name());
                } else {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, enumC8279d.name());
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m22070a(EnumC8335k enumC8335k) {
        C8006r c8006r;
        EnumC8424u enumC8424u = EnumC8424u.BANNER_RESIZE_EXPAND;
        InneractiveAdRequest inneractiveAdRequest = this.f21581r;
        AbstractC8236x abstractC8236x = this.f21582s;
        AbstractC9087e abstractC9087e = abstractC8236x != null ? abstractC8236x.f18374b : null;
        JSONArray jSONArrayM20435b = (abstractC8236x == null || (c8006r = abstractC8236x.f18375c) == null) ? null : c8006r.m20435b();
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18755c = enumC8424u;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        c8428w.m20807a("action", enumC8335k.m20723a()).m20808a((String) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m22071a(EnumC8335k enumC8335k, String str) {
        String strM20723a = enumC8335k.m20723a();
        C9248m c9248m = this.f21565b;
        if (c9248m != null) {
            c9248m.m22085a("window.mraidbridge.fireErrorEvent('" + strM20723a + "', '" + str + "');");
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX INFO: renamed from: a */
    public final void m22072a(String str, int i, int i2, boolean z, boolean z2) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ImageView imageView;
        if (this.f21565b == null || this.f21586O == EnumC9277z.DISABLED || this.f21585N != EnumC8329f0.DEFAULT) {
            return;
        }
        if (str != null && !URLUtil.isValidUrl(str)) {
            m22071a(EnumC8335k.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        try {
            ViewGroup viewGroup3 = (ViewGroup) this.f21565b.getRootView().findViewById(R.id.content);
            this.f21589R = viewGroup3;
            if (viewGroup3 == null) {
                IAlog.m21950f("Couldn't find content in the view tree", new Object[0]);
                m22071a(EnumC8335k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.f21610m0 = new C9265t(this);
                if (AbstractC9174o.m21989a(this.f21565b) instanceof Activity) {
                    ((Activity) AbstractC9174o.m21989a(this.f21565b)).getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f21610m0);
                }
            }
            this.f21595X = z;
            InterfaceC9243j1 interfaceC9243j1 = this.f21570g;
            if (interfaceC9243j1 != null) {
                ((InterfaceC9218b0) interfaceC9243j1).mo20926b(z);
            }
            m22074d(z2);
            if (this.f21602e0 >= 0) {
                this.f21602e0 = AbstractC9174o.m21998b(i2);
            }
            if (this.f21601d0 >= 0) {
                this.f21601d0 = AbstractC9174o.m21998b(i);
            }
            C9248m c9248m = this.f21565b;
            ViewGroup viewGroup4 = (ViewGroup) c9248m.getParent();
            if (viewGroup4 == null) {
                viewGroup = null;
            } else {
                View viewFindViewById = viewGroup4.findViewById(C7809R.id.ia_identifier_overlay);
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                } else {
                    viewGroup = null;
                }
            }
            if (str != null) {
                C9248m c9248m2 = new C9248m();
                this.f21590S = c9248m2;
                c9248m2.setId(C7809R.id.ia_inneractive_webview_mraid);
                this.f21590S.loadUrl(str);
                this.f21590S.setWebChromeClient(this.f21566c);
                this.f21590S.setWebViewClient(this.f21567d);
                c9248m = this.f21590S;
                c9248m.setOnKeyListener(new ViewOnKeyListenerC9267u(this));
            } else {
                C9248m c9248m3 = this.f21565b;
                if (c9248m3 != null && (viewGroup2 = (ViewGroup) c9248m3.getParent()) != null) {
                    int childCount = viewGroup2.getChildCount();
                    int i3 = 0;
                    while (i3 < childCount && viewGroup2.getChildAt(i3) != this.f21565b) {
                        i3++;
                    }
                    ViewGroup viewGroup5 = (ViewGroup) viewGroup2.findViewById(C7809R.id.ia_identifier_overlay);
                    this.f21604g0 = i3;
                    AbstractC9195v.m22027a(viewGroup5);
                    FrameLayout frameLayout = this.f21605h0;
                    if (frameLayout != null) {
                        AbstractC9195v.m22027a(frameLayout);
                        viewGroup2.addView(this.f21605h0, i3);
                        FrameLayout frameLayout2 = this.f21605h0;
                        int width = this.f21565b.getWidth();
                        int height = this.f21565b.getHeight();
                        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                        layoutParams.width = width;
                        layoutParams.height = height;
                        frameLayout2.setLayoutParams(layoutParams);
                        AbstractC9174o.m21994a(this.f21605h0, 17);
                    }
                    viewGroup2.removeView(this.f21565b);
                }
            }
            float f = this.f21596Y;
            int i4 = (int) ((50.0f * f) + 0.5f);
            if (i2 >= 0 && i >= 0) {
                i = (int) (i * f);
                i2 = (int) (i2 * f);
                if (i < i4) {
                    i = i4;
                }
                if (i2 < i4) {
                    i2 = i4;
                }
            }
            if (this.f21607j0 != null && this.f21606i0 != null) {
                View view = new View(AbstractC9174o.m21989a(this.f21565b));
                view.setBackgroundColor(AbstractC9174o.m21989a(this.f21565b).getResources().getColor(C7809R.color.ia_mraid_expanded_dimmed_bk));
                view.setOnTouchListener(new ViewOnTouchListenerC9250n());
                this.f21607j0.addView(view);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                view.setLayoutParams(layoutParams2);
                AbstractC9195v.m22027a(c9248m);
                this.f21606i0.addView(c9248m);
                ViewGroup.LayoutParams layoutParams3 = c9248m.getLayoutParams();
                layoutParams3.width = -1;
                layoutParams3.height = -1;
                c9248m.setLayoutParams(layoutParams3);
                AbstractC9195v.m22027a(this.f21606i0);
                this.f21607j0.addView(this.f21606i0);
                FrameLayout frameLayout3 = this.f21606i0;
                ViewGroup.LayoutParams layoutParams4 = frameLayout3.getLayoutParams();
                layoutParams4.width = i;
                layoutParams4.height = i2;
                frameLayout3.setLayoutParams(layoutParams4);
                AbstractC9174o.m21994a(this.f21606i0, 17);
            }
            FrameLayout frameLayout4 = this.f21607j0;
            if (frameLayout4 != null) {
                AbstractC9195v.m22027a(frameLayout4);
                C9111b c9111b = this.f21612o0;
                if (c9111b != null && (imageView = c9111b.f21362a) != null) {
                    AbstractC9195v.m22027a(imageView);
                    ImageView imageView2 = this.f21612o0.f21362a;
                    ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                    layoutParams5.width = -1;
                    layoutParams5.height = -1;
                    imageView2.setLayoutParams(layoutParams5);
                    this.f21607j0.addView(this.f21612o0.f21362a);
                }
                this.f21589R.addView(this.f21607j0);
                FrameLayout frameLayout5 = this.f21607j0;
                ViewGroup.LayoutParams layoutParams6 = frameLayout5.getLayoutParams();
                layoutParams6.width = -1;
                layoutParams6.height = -1;
                frameLayout5.setLayoutParams(layoutParams6);
            }
            if (!c9248m.hasFocus()) {
                c9248m.requestFocus();
            }
            EnumC9224d0 enumC9224d0 = this.f21587P;
            if (enumC9224d0 == EnumC9224d0.ALWAYS_VISIBLE || (!this.f21595X && enumC9224d0 != EnumC9224d0.ALWAYS_HIDDEN)) {
                m22073c(true);
            }
            EnumC8329f0 enumC8329f0 = EnumC8329f0.EXPANDED;
            this.f21585N = enumC8329f0;
            m22081a(new C8325d0(enumC8329f0));
            int i5 = this.f21601d0;
            if (i5 != -1 && this.f21602e0 != -1) {
                m22081a(new C8348x(AbstractC9174o.m22001c(i5), AbstractC9174o.m22001c(this.f21602e0)));
            }
            m22070a(EnumC8335k.EXPAND);
            if (viewGroup != null) {
                int dimension = (int) viewGroup.getContext().getResources().getDimension(C7809R.dimen.ia_identifier_padding);
                viewGroup.setPadding(dimension, 0, 0, dimension);
                viewGroup.setLayoutParams(this.f21589R.getLayoutParams());
                this.f21589R.addView(viewGroup);
            }
            InterfaceC9243j1 interfaceC9243j2 = this.f21570g;
            if (interfaceC9243j2 != null) {
                ((InterfaceC9218b0) interfaceC9243j2).mo20928d();
            }
        } catch (Exception unused) {
            IAlog.m21950f("Couldn't find content in the view tree", new Object[0]);
            m22071a(EnumC8335k.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i, com.fyber.inneractive.sdk.web.InterfaceC9246l
    /* JADX INFO: renamed from: a */
    public void mo21933a(boolean z) {
        m22081a(new C8331g0(z));
        super.mo21933a(z);
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i, com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: a */
    public boolean mo21934a(WebView webView, String str) {
        IAlog.m21945a("%shandle url for: %s webView = %s", IAlog.m21943a(this), str, webView);
        if (this.f21585N != EnumC8329f0.EXPANDED || TextUtils.isEmpty(str) || !webView.equals(this.f21590S) || this.f21591T) {
            return super.mo21934a(webView, str);
        }
        this.f21591T = true;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9246l
    /* JADX INFO: renamed from: b */
    public final void mo22046b() {
        AbstractC9183r.f21478b.post(new RunnableC9258r(this));
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i
    /* JADX INFO: renamed from: b */
    public final void mo22061b(boolean z) {
        C9248m c9248m = this.f21565b;
        if (c9248m != null && c9248m.getViewTreeObserver() != null) {
            this.f21565b.getViewTreeObserver().removeOnPreDrawListener(this.f21611n0);
        }
        AbstractC9183r.f21478b.post(new RunnableC9263s(this));
        C9248m c9248m2 = this.f21590S;
        if (c9248m2 != null && c9248m2.getParent() != null && (this.f21590S.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f21590S.getParent()).removeView(this.f21590S);
            this.f21590S = null;
        }
        FrameLayout frameLayout = this.f21606i0;
        if (frameLayout != null && this.f21607j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.f21607j0.removeAllViewsInLayout();
            ViewGroup viewGroup = this.f21589R;
            if (viewGroup != null) {
                viewGroup.removeView(this.f21607j0);
            }
        }
        this.f21606i0 = null;
        this.f21607j0 = null;
        this.f21605h0 = null;
        this.f21564a = false;
        C9111b c9111b = this.f21612o0;
        if (c9111b != null) {
            AbstractC9195v.m22027a(c9111b.f21362a);
            this.f21612o0 = null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            m22080r();
        }
        super.mo22061b(z);
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9246l
    /* JADX INFO: renamed from: c */
    public final void mo22047c() {
        C9248m c9248m = this.f21565b;
        if (c9248m != null && c9248m.getViewTreeObserver() != null) {
            this.f21565b.getViewTreeObserver().removeOnPreDrawListener(this.f21611n0);
        }
        AbstractC9183r.f21478b.post(new RunnableC9263s(this));
    }

    /* JADX INFO: renamed from: c */
    public final void m22073c(boolean z) {
        if (this.f21589R == null) {
            return;
        }
        if (z) {
            int iM21998b = AbstractC9174o.m21998b(35);
            if (this.f21594W == null) {
                IAcloseButton iAcloseButton = new IAcloseButton(AbstractC9174o.m21989a(this.f21565b), iM21998b);
                this.f21594W = iAcloseButton;
                iAcloseButton.setOnClickListener(new ViewOnClickListenerC9252o(this));
            }
            AbstractC9195v.m22027a(this.f21594W);
            FrameLayout frameLayout = this.f21607j0;
            if (frameLayout != null) {
                frameLayout.addView(this.f21594W);
                IAcloseButton iAcloseButton2 = this.f21594W;
                ViewGroup.LayoutParams layoutParams = iAcloseButton2.getLayoutParams();
                layoutParams.width = iM21998b;
                layoutParams.height = iM21998b;
                iAcloseButton2.setLayoutParams(layoutParams);
                AbstractC9174o.m21994a(this.f21594W, 53);
                IAcloseButton iAcloseButton3 = this.f21594W;
                int iM21998b2 = AbstractC9174o.m21998b(10);
                int iM21998b3 = AbstractC9174o.m21998b(10);
                ViewGroup.LayoutParams layoutParams2 = iAcloseButton3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.topMargin = iM21998b2;
                    marginLayoutParams.rightMargin = iM21998b3;
                    marginLayoutParams.bottomMargin = 0;
                    iAcloseButton3.setLayoutParams(marginLayoutParams);
                }
            }
        } else {
            FrameLayout frameLayout2 = this.f21607j0;
            if (frameLayout2 != null) {
                frameLayout2.removeView(this.f21594W);
            }
        }
        InterfaceC9243j1 interfaceC9243j1 = this.f21570g;
        if (interfaceC9243j1 != null) {
            ((InterfaceC9218b0) interfaceC9243j1).mo20926b(z);
        }
        this.f21595X = !z;
    }

    /* JADX INFO: renamed from: d */
    public final void m22074d(boolean z) {
        try {
            Activity activity = (Activity) AbstractC9174o.m21989a(this.f21565b);
            if (activity != null) {
                if (!z || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                    activity.setRequestedOrientation(this.f21592U);
                } else {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                }
            }
        } catch (Exception unused) {
            IAlog.m21945a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i
    /* JADX INFO: renamed from: g */
    public final C9152g1 mo22062g() {
        C9248m c9248m;
        return (this.f21585N != EnumC8329f0.EXPANDED || (c9248m = this.f21590S) == null) ? super.mo22062g() : c9248m.getLastClickedLocation();
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9238i
    /* JADX INFO: renamed from: h */
    public final void mo22063h() {
        super.mo22063h();
        FrameLayout frameLayout = this.f21606i0;
        if (frameLayout != null && this.f21607j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.f21607j0.removeAllViewsInLayout();
            ViewGroup viewGroup = this.f21589R;
            if (viewGroup != null) {
                viewGroup.removeView(this.f21607j0);
            }
        }
        this.f21585N = EnumC8329f0.LOADING;
        Context contextM21989a = AbstractC9174o.m21989a(this.f21565b);
        this.f21592U = contextM21989a instanceof Activity ? ((Activity) contextM21989a).getRequestedOrientation() : -1;
        this.f21606i0 = new FrameLayout(contextM21989a);
        this.f21607j0 = new FrameLayout(contextM21989a);
        FrameLayout frameLayout2 = new FrameLayout(contextM21989a);
        frameLayout2.setBackgroundColor(-858993460);
        this.f21605h0 = frameLayout2;
        mo22068a(contextM21989a, false);
        C9248m c9248m = this.f21565b;
        if (c9248m != null) {
            c9248m.setOnKeyListener(new ViewOnKeyListenerC9256q(this));
        }
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9240i1
    /* JADX INFO: renamed from: j */
    public final void mo22075j() {
        C9248m c9248m = this.f21565b;
        if (c9248m != null) {
            c9248m.m22085a("window.mraidbridge.fireReadyEvent();");
        }
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9240i1
    /* JADX INFO: renamed from: k */
    public void mo21938k() {
        ArrayList arrayList = new ArrayList();
        C9248m c9248m = this.f21565b;
        if (c9248m == null || c9248m.getScaleX() == 1.0f || this.f21565b.getScaleY() == 1.0f) {
            arrayList.add(new C8323c0(this.f21597Z, this.f21598a0));
            arrayList.add(new C8319a0(this.f21599b0, this.f21600c0));
        } else {
            arrayList.add(new C8323c0(this.f21565b.getWidthDp(), this.f21565b.getHeightDp()));
            arrayList.add(new C8319a0(this.f21565b.getWidthDp(), this.f21565b.getHeightDp()));
        }
        C9248m c9248m2 = this.f21565b;
        int iM22001c = AbstractC9174o.m22001c(c9248m2 != null ? c9248m2.getWidth() : this.f21599b0);
        C9248m c9248m3 = this.f21565b;
        arrayList.add(new C8350z(iM22001c, AbstractC9174o.m22001c(c9248m3 != null ? c9248m3.getHeight() : this.f21600c0)));
        m22082a(arrayList);
        EnumC8329f0 enumC8329f0 = EnumC8329f0.DEFAULT;
        this.f21585N = enumC8329f0;
        m22081a(new C8325d0(enumC8329f0));
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9240i1
    /* JADX INFO: renamed from: m */
    public final boolean mo22076m() {
        EnumC9221c0 enumC9221c0 = this.f21588Q;
        return enumC9221c0 != null && enumC9221c0.equals(EnumC9221c0.INTERSTITIAL);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    /* JADX INFO: renamed from: o */
    public final void m22077o() {
        ViewGroup viewGroup;
        C9248m c9248m;
        ViewGroup viewGroup2;
        C9248m c9248m2;
        EnumC8329f0 enumC8329f0;
        ViewGroup viewGroup3 = this.f21589R;
        ViewGroup viewGroup4 = null;
        if (viewGroup3 == null) {
            viewGroup = null;
        } else {
            View viewFindViewById = viewGroup3.findViewById(C7809R.id.ia_identifier_overlay);
            if (viewFindViewById instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewFindViewById;
            } else {
                viewGroup = null;
            }
        }
        if (viewGroup == null) {
            C9248m c9248m3 = this.f21565b;
            if (c9248m3 != null) {
                View viewFindViewById2 = c9248m3.findViewById(C7809R.id.ia_identifier_overlay);
                if (viewFindViewById2 instanceof ViewGroup) {
                    viewGroup4 = (ViewGroup) viewFindViewById2;
                }
            }
        } else {
            viewGroup4 = viewGroup;
        }
        this.f21591T = false;
        if (m22078p() || (enumC8329f0 = this.f21585N) == EnumC8329f0.RESIZED) {
            m22073c(false);
            C9248m c9248m4 = this.f21565b;
            if (c9248m4 != null) {
                EnumC8329f0 enumC8329f1 = this.f21585N;
                if (enumC8329f1 == EnumC8329f0.EXPANDED) {
                    FrameLayout frameLayout = this.f21606i0;
                    if (frameLayout != null && this.f21607j0 != null) {
                        frameLayout.removeAllViewsInLayout();
                        this.f21607j0.removeAllViewsInLayout();
                        ViewGroup viewGroup5 = this.f21589R;
                        if (viewGroup5 != null) {
                            viewGroup5.removeView(this.f21607j0);
                        }
                    }
                    FrameLayout frameLayout2 = this.f21605h0;
                    if (frameLayout2 != null && (viewGroup2 = (ViewGroup) frameLayout2.getParent()) != null) {
                        viewGroup2.addView(this.f21565b, this.f21604g0);
                        C9248m c9248m5 = this.f21565b;
                        int i = this.f21608k0;
                        int i2 = this.f21609l0;
                        ViewGroup.LayoutParams layoutParams = c9248m5.getLayoutParams();
                        layoutParams.width = i;
                        layoutParams.height = i2;
                        c9248m5.setLayoutParams(layoutParams);
                        AbstractC9174o.m21994a(this.f21565b, 17);
                        viewGroup2.removeView(this.f21605h0);
                        viewGroup2.invalidate();
                        this.f21565b.requestLayout();
                    }
                    this.f21601d0 = this.f21608k0;
                    this.f21602e0 = this.f21609l0;
                } else if (enumC8329f1 == EnumC8329f0.RESIZED) {
                    int i3 = this.f21608k0;
                    this.f21601d0 = i3;
                    int i4 = this.f21609l0;
                    this.f21602e0 = i4;
                    ViewGroup.LayoutParams layoutParams2 = c9248m4.getLayoutParams();
                    layoutParams2.width = i3;
                    layoutParams2.height = i4;
                    c9248m4.setLayoutParams(layoutParams2);
                    AbstractC9174o.m21994a(this.f21565b, 17);
                }
            }
            if (viewGroup4 != null && (c9248m = this.f21565b) != null) {
                viewGroup4.setLayoutParams(c9248m.getLayoutParams());
                if (m22078p()) {
                    AbstractC9195v.m22027a(viewGroup4);
                    this.f21565b.addView(viewGroup4);
                }
            }
            this.f21585N = EnumC8329f0.DEFAULT;
            m22074d(false);
            m22081a(new C8325d0(this.f21585N));
        } else if (enumC8329f0 == EnumC8329f0.DEFAULT) {
            EnumC8329f0 enumC8329f2 = EnumC8329f0.HIDDEN;
            this.f21585N = enumC8329f2;
            m22081a(new C8325d0(enumC8329f2));
        }
        if (viewGroup4 != null) {
            viewGroup4.setPadding(0, 0, 0, 0);
        }
        InterfaceC9243j1 interfaceC9243j1 = this.f21570g;
        if (interfaceC9243j1 != null) {
            ((InterfaceC9218b0) interfaceC9243j1).onClose();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            m22080r();
        }
        C9111b c9111b = this.f21612o0;
        if (c9111b == null || c9111b.f21362a == null || (c9248m2 = this.f21565b) == null || c9248m2.getParent() == null || this.f21613p0 == null) {
            return;
        }
        AbstractC9195v.m22027a(this.f21612o0.f21362a);
        ImageView imageView = this.f21612o0.f21362a;
        C9155h1 c9155h1 = this.f21613p0;
        imageView.setLayoutParams(AbstractC9195v.m22023a(c9155h1.f21454a, c9155h1.f21455b, 13));
        ((ViewGroup) this.f21565b.getParent()).addView(this.f21612o0.f21362a);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22078p() {
        return this.f21585N == EnumC8329f0.EXPANDED;
    }

    /* JADX INFO: renamed from: q */
    public final void m22079q() {
        AbstractC8280e c8277b;
        AbstractC9087e abstractC9087e;
        C8271e c8271e = this.f21621H;
        if (c8271e != null) {
            C9248m c9248m = this.f21565b;
            AbstractC8236x abstractC8236x = this.f21582s;
            boolean z = false;
            IAlog.m21945a("omsdk initMraidSession", new Object[0]);
            Partner partner = c8271e.f18437e;
            if (partner == null) {
                IAlog.m21945a("omsdk partner is null", new Object[0]);
                c8277b = null;
            } else {
                if (abstractC8236x != null && (abstractC9087e = abstractC8236x.f18374b) != null && abstractC9087e.f21297G) {
                    z = true;
                }
                c8271e.f18438f.getClass();
                c8277b = z ? new C8277b(partner, c9248m) : new C8276a(partner, c9248m);
                c8277b.mo20680a(c9248m);
            }
            this.f21622I = c8277b;
        }
        InterfaceC9232g interfaceC9232g = this.f21569f;
        if (interfaceC9232g != null) {
            interfaceC9232g.mo20538a(this);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m22080r() {
        try {
            if (!(AbstractC9174o.m21989a(this.f21565b) instanceof Activity) || this.f21610m0 == null) {
                return;
            }
            ((Activity) AbstractC9174o.m21989a(this.f21565b)).getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f21610m0);
            this.f21610m0 = null;
        } catch (Exception e) {
            IAlog.m21950f("failed to unregisterOnBackInvokedCallback with error: %s", e.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.web.AbstractC9240i1
    public void setAdDefaultSize(int i, int i2) {
        this.f21608k0 = i;
        this.f21609l0 = i2;
        this.f21601d0 = i;
        this.f21602e0 = i2;
    }

    public void setOrientationProperties(boolean z, String str) {
        if (C11744X3.i.f26322D.equals(str)) {
            this.f21603f0 = Orientation.PORTRAIT;
        } else if (C11744X3.i.f26320C.equals(str)) {
            this.f21603f0 = Orientation.LANDSCAPE;
        } else {
            this.f21603f0 = Orientation.NONE;
        }
        InterfaceC9243j1 interfaceC9243j1 = this.f21570g;
        if (interfaceC9243j1 != null) {
            ((InterfaceC9218b0) interfaceC9243j1).mo20924a(z, this.f21603f0);
        }
    }

    public void setResizeProperties() {
    }
}
