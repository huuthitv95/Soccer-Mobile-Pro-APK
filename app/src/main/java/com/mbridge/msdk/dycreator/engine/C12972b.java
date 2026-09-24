package com.mbridge.msdk.dycreator.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C11341A5;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.utils.C12979b;
import com.mbridge.msdk.dycreator.utils.C12982e;
import com.mbridge.msdk.dycreator.utils.C12984g;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.engine.b */
/* JADX INFO: compiled from: MBResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12972b {

    /* JADX INFO: renamed from: g */
    private static volatile C12972b f35281g;

    /* JADX INFO: renamed from: a */
    private SoftReference<HashMap<String, EnumC12973c>> f35282a;

    /* JADX INFO: renamed from: b */
    private SoftReference<HashMap<String, String>> f35283b;

    /* JADX INFO: renamed from: c */
    private SoftReference<HashMap<String, EnumC12973c>> f35284c;

    /* JADX INFO: renamed from: d */
    private String f35285d;

    /* JADX INFO: renamed from: e */
    private String f35286e;

    /* JADX INFO: renamed from: f */
    private Context f35287f;

    private C12972b() {
    }

    /* JADX INFO: renamed from: a */
    public static C12972b m36361a() {
        if (f35281g == null) {
            synchronized (C12972b.class) {
                if (f35281g == null) {
                    f35281g = new C12972b();
                }
            }
        }
        return f35281g;
    }

    /* JADX INFO: renamed from: b */
    public HashMap m36368b() {
        SoftReference<HashMap<String, EnumC12973c>> softReference = this.f35282a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", EnumC12973c.layout_width);
            map.put("layout_height", EnumC12973c.layout_height);
            map.put("orientation", EnumC12973c.orientation);
            map.put("layout_centerHorizontal", EnumC12973c.layout_centerHorizontal);
            map.put("layout_centerVertical", EnumC12973c.layout_centerVertical);
            EnumC12973c enumC12973c = EnumC12973c.layout_marginLeft;
            map.put("layout_marginLeft", enumC12973c);
            EnumC12973c enumC12973c2 = EnumC12973c.layout_marginRight;
            map.put("layout_marginRight", enumC12973c2);
            map.put("layout_margin", EnumC12973c.layout_margin);
            map.put("layout_gravity", EnumC12973c.layout_gravity);
            map.put("layout_alignParentRight", EnumC12973c.layout_alignParentRight);
            map.put("layout_weight", EnumC12973c.layout_weight);
            map.put("contentDescription", EnumC12973c.contentDescription);
            map.put("gravity", EnumC12973c.gravity);
            map.put("id", EnumC12973c.id);
            map.put("layout_below", EnumC12973c.layout_below);
            map.put("layout_above", EnumC12973c.layout_above);
            map.put("layout_toLeftOf", EnumC12973c.layout_toLeftOf);
            map.put("layout_toRightOf", EnumC12973c.layout_toRightOf);
            map.put("layout_toEndOf", EnumC12973c.layout_toEndOf);
            map.put("background", EnumC12973c.background);
            map.put("layout_marginTop", EnumC12973c.layout_marginTop);
            map.put("layout_marginBottom", EnumC12973c.layout_marginBottom);
            map.put("layout_marginLeft", enumC12973c);
            map.put("layout_marginRight", enumC12973c2);
            map.put("layout_alignParentBottom", EnumC12973c.layout_alignParentBottom);
            map.put("layout_alignParentTop", EnumC12973c.layout_alignParentTop);
            map.put("layout_alignParentLeft", EnumC12973c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", EnumC12973c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", EnumC12973c.layout_alignTop);
            map.put("layout_alignBottom", EnumC12973c.layout_alignBottom);
            map.put("layout_alignLeft", EnumC12973c.layout_alignLeft);
            map.put("layout_alignRight", EnumC12973c.layout_alignRight);
            map.put("layout_centerInParent", EnumC12973c.layout_centerInParent);
            map.put("layout_alignParentEnd", EnumC12973c.layout_alignParentEnd);
            this.f35282a = new SoftReference<>(map);
        }
        return this.f35282a.get();
    }

    /* JADX INFO: renamed from: c */
    public HashMap<String, EnumC12973c> m36370c() {
        SoftReference<HashMap<String, EnumC12973c>> softReference = this.f35284c;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(55);
            map.put("id", EnumC12973c.id);
            map.put("text", EnumC12973c.text);
            map.put("ellipsize", EnumC12973c.ellipsize);
            map.put("singleLine", EnumC12973c.singleLine);
            map.put("lines", EnumC12973c.lines);
            map.put("maxLength", EnumC12973c.maxLength);
            map.put("drawableLeft", EnumC12973c.drawableLeft);
            map.put("drawablePadding", EnumC12973c.drawablePadding);
            map.put("fadingEdge", EnumC12973c.fadingEdge);
            map.put("scrollHorizontally", EnumC12973c.scrollHorizontally);
            map.put("textColor", EnumC12973c.textColor);
            map.put("textSize", EnumC12973c.textSize);
            map.put("visibility", EnumC12973c.visibility);
            EnumC12973c enumC12973c = EnumC12973c.background;
            map.put("background", enumC12973c);
            map.put("textStyle", EnumC12973c.textStyle);
            map.put("style", EnumC12973c.style);
            map.put("layout_width", EnumC12973c.layout_width);
            map.put("layout_height", EnumC12973c.layout_height);
            map.put("layout_below", EnumC12973c.layout_below);
            map.put("layout_centerInParent", EnumC12973c.layout_centerInParent);
            map.put("contentDescription", EnumC12973c.contentDescription);
            map.put("src", EnumC12973c.src);
            map.put("gravity", EnumC12973c.gravity);
            map.put("orientation", EnumC12973c.orientation);
            map.put("numColumns", EnumC12973c.numColumns);
            map.put("verticalSpacing", EnumC12973c.verticalSpacing);
            map.put("horizontalSpacing", EnumC12973c.horizontalSpacing);
            map.put("background", enumC12973c);
            map.put("layout_marginBottom", EnumC12973c.layout_marginBottom);
            map.put("scaleType", EnumC12973c.scaleType);
            map.put(ViewHierarchyConstants.TAG_KEY, EnumC12973c.tag);
            map.put("layout_gravity", EnumC12973c.layout_gravity);
            map.put("parent_view", EnumC12973c.parent_view);
            map.put("padding", EnumC12973c.padding);
            map.put("paddingTop", EnumC12973c.paddingTop);
            map.put("paddingBottom", EnumC12973c.paddingBottom);
            map.put("paddingLeft", EnumC12973c.paddingLeft);
            map.put("paddingRight", EnumC12973c.paddingRight);
            map.put("divider", EnumC12973c.divider);
            map.put("scrollbars", EnumC12973c.scrollbars);
            map.put("listSelector", EnumC12973c.listSelector);
            this.f35284c = new SoftReference<>(map);
        }
        return this.f35284c.get();
    }

    /* JADX INFO: renamed from: d */
    public int m36371d(String str) {
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (!str.startsWith("#")) {
            if (!str.startsWith("@color/")) {
                return ViewCompat.MEASURED_STATE_MASK;
            }
            return C13008c.m36588n().m36542d().getColor(C13203i0.m37707a(C13008c.m36588n().m36542d(), str.substring(7), "color"));
        }
        int length = str.length();
        if (length == 7) {
            return (int) Long.decode(str.replace("#", "#FF")).longValue();
        }
        if (length == 9) {
            return (int) Long.decode(str).longValue();
        }
        C12984g.m36420a("返回白色背景");
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public View m36373e(String str) {
        if (this.f35287f != null) {
            try {
                C12971a c12971a = new C12971a(this.f35287f);
                new String();
                C12984g.m36420a(str.toString());
                return c12971a.m36355a(str, (ViewGroup) null);
            } catch (Exception e) {
                C13219q0.m37816b("MBResource", e.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public String m36374f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("@")) {
            return str;
        }
        SoftReference<HashMap<String, String>> softReference = this.f35283b;
        if (softReference == null || softReference.get() == null) {
            this.f35283b = new SoftReference<>(m36372d());
        }
        String strSubstring = str.substring(8);
        if (this.f35283b.get() == null || this.f35283b.get().size() <= 0) {
            return null;
        }
        String str2 = this.f35283b.get().get(strSubstring);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            return C13008c.m36588n().m36542d().getString(C13203i0.m37707a(C13008c.m36588n().m36542d(), strSubstring, TypedValues.Custom.S_STRING));
        } catch (Exception e) {
            C13219q0.m37816b("MBResource", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36365a(Context context, String str) {
        try {
            if (C12984g.f35380a) {
                this.f35285d = context.getFilesDir().toString();
            } else {
                this.f35285d = str;
            }
            if (C12982e.m36411a(context).heightPixels <= 320 || C12984g.f35380a) {
                this.f35286e = "/drawable-mdpi/";
            } else {
                this.f35286e = "/drawable-hdpi/";
            }
            this.f35287f = context;
            C12979b.f35377a = m36361a().m36372d();
        } catch (Exception e) {
            C13219q0.m37816b("MBResource", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: d */
    public HashMap<String, String> m36372d() {
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = this.f35287f.getAssets().open("rv_binddatas.xml");
        } catch (IOException e) {
            e.printStackTrace();
            inputStreamOpen = null;
        }
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        try {
            xmlPullParserNewPullParser.setInput(inputStreamOpen, C11341A5.f23802O);
            HashMap<String, String> map = new HashMap<>();
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2 && TypedValues.Custom.S_STRING.equals(xmlPullParserNewPullParser.getName())) {
                    map.put(xmlPullParserNewPullParser.getAttributeValue(0), xmlPullParserNewPullParser.nextText());
                }
            }
            return map;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36364a(Context context) {
        try {
            if (C12982e.m36411a(context).heightPixels <= 320 || C12984g.f35380a) {
                this.f35286e = "/drawable-mdpi/";
            } else {
                this.f35286e = "/drawable-hdpi/";
            }
            this.f35287f = context;
            C12979b.f35377a = m36361a().m36372d();
        } catch (Exception e) {
            C13219q0.m37816b("MBResource", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public GradientDrawable m36363a(String[] strArr) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
            gradientDrawable.setGradientType(0);
            return gradientDrawable;
        } catch (Exception e) {
            C13219q0.m37816b("MBResource", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m36367b(String str) {
        String[] strArrSplit = str.toUpperCase().split("\\|");
        int i = 48;
        try {
            Class<?> cls = Class.forName("android.view.Gravity");
            for (String str2 : strArrSplit) {
                i = cls.getField(str2).getInt(null);
            }
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return 48;
        }
    }

    /* JADX INFO: renamed from: c */
    public int m36369c(String str) {
        if (this.f35287f == null) {
            return 0;
        }
        String strM36550i = C13008c.m36588n().m36550i();
        if (TextUtils.isEmpty(strM36550i)) {
            strM36550i = this.f35287f.getPackageName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strM36550i);
        sb.append(".R$");
        String[] strArrSplit = str.split("\\.");
        sb.append(strArrSplit[1]);
        try {
            Class<?> cls = Class.forName(sb.toString());
            Object objNewInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField(strArrSplit[2]);
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(objNewInstance)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m36362a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf("d");
            int iIndexOf2 = str.indexOf(CmcdData.Factory.STREAMING_FORMAT_SS);
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains("d")) {
                return C12982e.m36410a(this.f35287f, i);
            }
            str.contains(CmcdData.Factory.STREAMING_FORMAT_SS);
            return i;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36366a(String str, ImageView imageView) {
        Context context;
        if (str == null || !str.startsWith("@drawable/") || (context = this.f35287f) == null) {
            return;
        }
        try {
            Resources resources = context.getResources();
            String strM36550i = C13008c.m36588n().m36550i();
            if (TextUtils.isEmpty(strM36550i)) {
                strM36550i = this.f35287f.getPackageName();
            }
            imageView.setImageResource(resources.getIdentifier(str, "drawable", strM36550i));
        } catch (Exception e) {
            C13219q0.m37816b("MBResource", e.getMessage());
        }
    }
}
