package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.measurement.C8273g;
import com.fyber.inneractive.sdk.measurement.C8274h;
import com.fyber.inneractive.sdk.measurement.EnumC8275i;
import com.fyber.inneractive.sdk.model.vast.AbstractC8298g;
import com.fyber.inneractive.sdk.model.vast.C8292a0;
import com.fyber.inneractive.sdk.model.vast.C8293b;
import com.fyber.inneractive.sdk.model.vast.C8294c;
import com.fyber.inneractive.sdk.model.vast.C8296e;
import com.fyber.inneractive.sdk.model.vast.C8297f;
import com.fyber.inneractive.sdk.model.vast.C8299h;
import com.fyber.inneractive.sdk.model.vast.C8301j;
import com.fyber.inneractive.sdk.model.vast.C8303l;
import com.fyber.inneractive.sdk.model.vast.C8304m;
import com.fyber.inneractive.sdk.model.vast.C8305n;
import com.fyber.inneractive.sdk.model.vast.C8306o;
import com.fyber.inneractive.sdk.model.vast.C8308q;
import com.fyber.inneractive.sdk.model.vast.C8309r;
import com.fyber.inneractive.sdk.model.vast.C8313v;
import com.fyber.inneractive.sdk.model.vast.C8314w;
import com.fyber.inneractive.sdk.model.vast.EnumC8300i;
import com.fyber.inneractive.sdk.model.vast.EnumC8302k;
import com.fyber.inneractive.sdk.model.vast.EnumC8310s;
import com.fyber.inneractive.sdk.model.vast.EnumC8311t;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.util.AbstractC9154h0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.vast.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8226c {

    /* JADX INFO: renamed from: a */
    public final boolean f18335a;

    /* JADX INFO: renamed from: b */
    public int f18336b = -1;

    /* JADX INFO: renamed from: c */
    public int f18337c = -1;

    /* JADX INFO: renamed from: d */
    public int f18338d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f18339e = false;

    /* JADX INFO: renamed from: f */
    public boolean f18340f = false;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f18341g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public final ArrayList f18342h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f18343i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ArrayList f18344j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final ArrayList f18345k = new ArrayList();

    public C8226c(boolean z) {
        this.f18335a = true;
        this.f18335a = z;
    }

    /* JADX INFO: renamed from: a */
    public final C8293b m20628a(C8297f c8297f, List list, String str) {
        List list2;
        ArrayList arrayList;
        int iM22004e = AbstractC9174o.m22004e();
        int iM22002d = AbstractC9174o.m22002d();
        IAlog.m21945a("%sprocess started", "VastProcessor: ");
        if (c8297f == null || c8297f.f18530c == null) {
            IAlog.m21945a("%sno inline found", "VastProcessor: ");
            throw new C8231h("ErrorNoMediaFiles", "Empty inline ad found");
        }
        C8293b c8293b = new C8293b(new C8230g(this.f18338d, iM22004e, iM22002d), new C8227d(iM22004e, iM22002d));
        c8293b.f18499a = str;
        ArrayList arrayList2 = c8297f.f18530c.f18533c;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            list2 = list;
            throw new C8231h("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        if (list == null) {
            list2 = list;
            if (c8297f.f18529b != null) {
                arrayList = new ArrayList();
                arrayList.add(c8297f);
            }
        }
        if (list2 != null) {
            list2 = arrayList;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C8292a0 c8292a0 = ((C8297f) it.next()).f18529b;
                if (c8292a0 != null) {
                    m20629a(c8293b, c8292a0);
                }
            }
        }
        list2 = arrayList;
        m20629a(c8293b, c8297f.f18530c);
        if (c8293b.f18502d.size() == 0) {
            if (this.f18341g.isEmpty()) {
                throw new C8231h("ErrorNoMediaFiles", "No media files exist after merge");
            }
            throw new C8231h("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
        }
        ArrayList<C8294c> arrayList3 = new ArrayList(c8293b.f18505g);
        Collections.sort(arrayList3, c8293b.f18506h);
        if (!arrayList3.isEmpty()) {
            for (C8299h c8299h : this.f18344j) {
                if (!c8299h.m20705a()) {
                    for (C8294c c8294c : arrayList3) {
                        ArrayList arrayList4 = c8299h.f18546h;
                        if (arrayList4 != null) {
                            Iterator it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                c8294c.m20701a(EnumC8315x.EVENT_CLICK, (String) it2.next());
                            }
                        }
                        String str2 = c8299h.f18545g;
                        if (TextUtils.isEmpty(c8294c.f18521g)) {
                            c8294c.f18521g = str2;
                        }
                        ArrayList<C8314w> arrayList5 = c8299h.f18548j;
                        if (arrayList5 != null) {
                            for (C8314w c8314w : arrayList5) {
                                EnumC8315x enumC8315xM20711a = EnumC8315x.m20711a(c8314w.f18582a);
                                String str3 = c8314w.f18583b;
                                if (enumC8315xM20711a != null && str3 != null) {
                                    c8294c.m20701a(enumC8315xM20711a, str3);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (IAlog.f21426a == 2) {
            IAlog.m21949e("%sLogging merged model media files: ", "VastProcessor: ");
            Iterator it3 = new ArrayList(c8293b.f18502d).iterator();
            int i = 0;
            while (it3.hasNext()) {
                IAlog.m21949e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i), (C8309r) it3.next());
                i++;
            }
        }
        if (IAlog.f21426a == 2) {
            IAlog.m21949e("%sLogging merged model companion ads: ", "VastProcessor: ");
            ArrayList arrayList6 = new ArrayList(c8293b.f18505g);
            Collections.sort(arrayList6, c8293b.f18506h);
            if (arrayList6.size() > 0) {
                Iterator it4 = arrayList6.iterator();
                int i2 = 0;
                while (it4.hasNext()) {
                    IAlog.m21949e("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), ((C8294c) it4.next()).m20700a());
                    i2++;
                }
            } else {
                IAlog.m21949e("%sNo companion ads found!", "VastProcessor: ");
            }
        }
        return c8293b;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:78:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX INFO: renamed from: a */
    public final void m20629a(C8293b c8293b, AbstractC8298g abstractC8298g) {
        int i;
        String str;
        String[] strArrSplit;
        int i2;
        C8229f c8229f;
        String str2;
        Integer num;
        C8229f c8229f2;
        HashMap map;
        List list;
        int i3 = 0;
        IAlog.m21945a("%sprocessing ad element: %s", "VastProcessor: ", abstractC8298g);
        ArrayList<String> arrayList = abstractC8298g.f18532b;
        if (arrayList != null) {
            for (String str3 : arrayList) {
                IAlog.m21945a("%sadding impression url: %s", "VastProcessor: ", str3);
                EnumC8315x enumC8315x = EnumC8315x.EVENT_IMPRESSION;
                if (!AbstractC9154h0.m21970f(str3)) {
                    throw new C8231h("VastErrorUnsecure", "found unsecure tracking event: " + enumC8315x.m20712a());
                }
                c8293b.m20699a(enumC8315x, str3);
            }
        }
        String str4 = abstractC8298g.f18531a;
        if (!TextUtils.isEmpty(str4)) {
            IAlog.m21945a("%sadding error url: %s", "VastProcessor: ", str4);
            c8293b.m20699a(EnumC8315x.EVENT_ERROR, str4);
        }
        if (IAConfigManager.f17654M.f17665I != null) {
            for (C8274h c8274h : abstractC8298g.f18534d) {
                if (c8274h.m20678b()) {
                    c8293b.f18503e.add(c8274h);
                } else {
                    EnumC8315x enumC8315x2 = EnumC8315x.EVENT_VERIFICATION_NOT_EXECUTED;
                    if (((enumC8315x2 == null || (map = c8274h.f18452c) == null || (list = (List) map.get(enumC8315x2)) == null) ? 0 : list.size()) > 0) {
                        C8870n.m21417a(new C8273g(c8274h.mo20518a(enumC8315x2), EnumC8275i.VERIFICATION_NOT_SUPPORTED), enumC8315x2);
                    }
                    this.f18345k.add(c8274h);
                }
            }
        }
        for (C8304m c8304m : abstractC8298g.f18533c) {
            C8308q c8308q = c8304m.f18552a;
            if (c8308q != null) {
                ArrayList<C8309r> arrayList2 = c8308q.f18559a;
                if (arrayList2 != null) {
                    c8293b.f18508j = arrayList2.size();
                    for (C8309r c8309r : arrayList2) {
                        String str5 = c8309r.f18564a;
                        EnumC8310s enumC8310s = EnumC8310s.progressive;
                        if (str5.equals(enumC8310s.m20708a())) {
                            i2 = i3;
                            if (this.f18337c > -1 && (num = c8309r.f18568e) != null && num.intValue() != 0) {
                                int iIntValue = c8309r.f18568e.intValue();
                                int i4 = this.f18336b;
                                if (iIntValue < i4) {
                                    c8229f2 = new C8229f(EnumC8228e.BITRATE_NOT_IN_RANGE, Integer.valueOf(i4));
                                } else {
                                    int iIntValue2 = c8309r.f18568e.intValue();
                                    int i5 = this.f18337c;
                                    if (iIntValue2 > i5) {
                                        c8229f2 = new C8229f(EnumC8228e.BITRATE_NOT_IN_RANGE, Integer.valueOf(i5));
                                    } else if (EnumC8311t.m20709a(c8309r.f18567d) != EnumC8311t.UNKNOWN) {
                                        c8229f = new C8229f(EnumC8228e.UNSUPPORTED_MIME_TYPE);
                                    } else if (this.f18339e) {
                                        str2 = c8309r.f18569f;
                                        if (str2 == null) {
                                            if (TextUtils.isEmpty(c8309r.f18570g)) {
                                                c8229f = new C8229f(EnumC8228e.NO_CONTENT);
                                            } else if (AbstractC9154h0.m21970f(c8309r.f18570g)) {
                                                c8229f = null;
                                            } else {
                                                c8229f = new C8229f(EnumC8228e.UNSECURED_VIDEO_URL);
                                            }
                                        } else if (TextUtils.isEmpty(c8309r.f18570g)) {
                                            c8229f = new C8229f(EnumC8228e.NO_CONTENT);
                                        } else if (AbstractC9154h0.m21970f(c8309r.f18570g)) {
                                            c8229f = new C8229f(EnumC8228e.UNSECURED_VIDEO_URL);
                                        } else {
                                            c8229f = null;
                                        }
                                    } else {
                                        str2 = c8309r.f18569f;
                                        if (str2 == null) {
                                            if (TextUtils.isEmpty(c8309r.f18570g)) {
                                                c8229f = new C8229f(EnumC8228e.NO_CONTENT);
                                            } else if (AbstractC9154h0.m21970f(c8309r.f18570g)) {
                                                c8229f = new C8229f(EnumC8228e.UNSECURED_VIDEO_URL);
                                            } else {
                                                c8229f = null;
                                            }
                                        } else if (TextUtils.isEmpty(c8309r.f18570g)) {
                                            c8229f = new C8229f(EnumC8228e.NO_CONTENT);
                                        } else if (AbstractC9154h0.m21970f(c8309r.f18570g)) {
                                            c8229f = new C8229f(EnumC8228e.UNSECURED_VIDEO_URL);
                                        } else {
                                            c8229f = null;
                                        }
                                    }
                                }
                                c8229f = c8229f2;
                            } else if (EnumC8311t.m20709a(c8309r.f18567d) != EnumC8311t.UNKNOWN) {
                                c8229f = new C8229f(EnumC8228e.UNSUPPORTED_MIME_TYPE);
                            } else if (this.f18339e || c8309r.f18565b.intValue() < c8309r.f18566c.intValue()) {
                                str2 = c8309r.f18569f;
                                if (str2 == null && this.f18340f && str2.equalsIgnoreCase("VPAID")) {
                                    c8229f = new C8229f(EnumC8228e.FILTERED_BY_APP_OR_UNIT);
                                } else if (TextUtils.isEmpty(c8309r.f18570g)) {
                                    c8229f = new C8229f(EnumC8228e.NO_CONTENT);
                                } else if (AbstractC9154h0.m21970f(c8309r.f18570g)) {
                                    c8229f = new C8229f(EnumC8228e.UNSECURED_VIDEO_URL);
                                } else {
                                    c8229f = null;
                                }
                            } else {
                                c8229f = new C8229f(EnumC8228e.VERTICAL_VIDEO_EXPECTED);
                            }
                        } else {
                            i2 = i3;
                            c8229f = new C8229f(EnumC8228e.UNSUPPORTED_DELIVERY, enumC8310s.m20708a());
                        }
                        if (c8229f != null) {
                            Object[] objArr = new Object[2];
                            objArr[i2] = "VastProcessor: ";
                            objArr[1] = c8309r;
                            IAlog.m21945a("%smedia file filtered!: %s", objArr);
                            Object[] objArr2 = new Object[2];
                            objArr2[i2] = "VastProcessor: ";
                            objArr2[1] = c8309r;
                            IAlog.m21945a("%s-- %s", objArr2);
                            Object[] objArr3 = new Object[2];
                            objArr3[i2] = "VastProcessor: ";
                            objArr3[1] = c8229f;
                            IAlog.m21945a("%s-- %s", objArr3);
                            this.f18341g.put(c8309r, c8229f);
                        } else {
                            Object[] objArr4 = new Object[2];
                            objArr4[i2] = "VastProcessor: ";
                            objArr4[1] = c8309r;
                            IAlog.m21945a("%sadding media file: %s", objArr4);
                            c8293b.f18502d.add(c8309r);
                            c8293b.f18509k.add(c8309r);
                            c8293b.f18507i++;
                        }
                        i3 = i2;
                    }
                }
                i = i3;
                ArrayList<String> arrayList3 = c8308q.f18562d;
                if (arrayList3 != null) {
                    for (String str6 : arrayList3) {
                        EnumC8315x enumC8315x3 = EnumC8315x.EVENT_CLICK;
                        if (!AbstractC9154h0.m21970f(str6)) {
                            throw new C8231h("VastErrorUnsecure", "found unsecure tracking event: " + enumC8315x3.m20712a());
                        }
                        c8293b.m20699a(enumC8315x3, str6);
                    }
                }
                ArrayList<C8314w> arrayList4 = c8308q.f18560b;
                if (arrayList4 != null) {
                    for (C8314w c8314w : arrayList4) {
                        EnumC8315x enumC8315xM20711a = EnumC8315x.m20711a(c8314w.f18582a);
                        if (enumC8315xM20711a != EnumC8315x.UNKNOWN) {
                            c8293b.m20699a(enumC8315xM20711a, c8314w.f18583b);
                        }
                        if (enumC8315xM20711a == EnumC8315x.EVENT_PROGRESS) {
                            String str7 = c8314w.f18583b;
                            String str8 = c8314w.f18584c;
                            C8296e c8296e = new C8296e(str7, str8);
                            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8) && c8296e.f18527d != 0) {
                                c8293b.f18511m.add(c8296e);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(c8308q.f18561c)) {
                    c8293b.f18500b = c8308q.f18561c;
                }
                String str9 = c8308q.f18563e;
                if (!TextUtils.isEmpty(str9) && (strArrSplit = str9.split(CertificateUtil.DELIMITER)) != null && strArrSplit.length <= 3) {
                    if (strArrSplit.length == 1) {
                        try {
                            Integer.parseInt(str9);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (strArrSplit.length == 2) {
                        Integer.parseInt(strArrSplit[1]);
                        Integer.parseInt(strArrSplit[i]);
                    } else {
                        Integer.parseInt(strArrSplit[2]);
                        Integer.parseInt(strArrSplit[1]);
                        Integer.parseInt(strArrSplit[i]);
                    }
                }
            } else {
                i = i3;
            }
            if (this.f18335a) {
                C8306o c8306o = abstractC8298g.f18535e;
                if (c8306o != null) {
                    c8293b.f18504f = c8306o;
                }
                C8313v c8313v = abstractC8298g.f18537g;
                if (c8313v != null) {
                    c8293b.f18514p = c8313v;
                }
                C8301j c8301j = c8304m.f18553b;
                ArrayList<C8299h> arrayList5 = c8301j == null ? null : c8301j.f18549a;
                if (arrayList5 != null) {
                    for (C8299h c8299h : arrayList5) {
                        try {
                            m20630a(c8293b, c8299h, abstractC8298g.f18536f);
                        } catch (C8225b e) {
                            String message = e.getMessage();
                            Object[] objArr5 = new Object[2];
                            objArr5[i] = c8299h;
                            objArr5[1] = message;
                            IAlog.m21945a("Failed processing companion ad: %s error = %s", objArr5);
                            c8299h.f18547i = e;
                            this.f18342h.add(c8299h);
                        }
                    }
                }
                ArrayList arrayList6 = abstractC8298g.f18538h;
                if (arrayList6.isEmpty()) {
                    i3 = i;
                    str = null;
                } else {
                    i3 = i;
                    str = ((C8305n) arrayList6.get(i3)).f18554a;
                }
                if (!TextUtils.isEmpty(str)) {
                    c8293b.f18512n = str;
                }
            } else {
                i3 = i;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20630a(C8293b c8293b, C8299h c8299h, int i) throws C8225b {
        C8293b c8293b2;
        ArrayList<String> arrayList = c8299h.f18546h;
        if (arrayList.size() > 0) {
            for (String str : arrayList) {
                if (!AbstractC9154h0.m21970f(str)) {
                    throw new C8225b("Found non-secure click tracking url for companion. url: " + str, 0);
                }
            }
            if (i > 0) {
                this.f18343i.add(c8299h);
            }
        }
        String str2 = c8299h.f18545g;
        if (!AbstractC9154h0.m21970f(str2)) {
            throw new C8225b("Found non-secure click through url: " + str2, 0);
        }
        if (!c8299h.m20705a()) {
            if (this.f18344j.contains(c8299h)) {
                return;
            }
            this.f18344j.add(c8299h);
            return;
        }
        Integer num = c8299h.f18539a;
        Integer num2 = c8299h.f18540b;
        if (num == null || num2 == null || num.intValue() < 100 || num2.intValue() < 100) {
            throw new C8225b("Incompatible size: " + num + "," + num2, 16);
        }
        ArrayList<C8314w> arrayList2 = c8299h.f18548j;
        for (C8314w c8314w : arrayList2) {
            if (!AbstractC9154h0.m21970f(c8314w.f18583b)) {
                throw new C8225b("Found non-secure tracking event: " + c8314w, 0);
            }
        }
        String str3 = c8299h.f18541c;
        C8303l c8303l = c8299h.f18542d;
        if (c8303l != null) {
            EnumC8302k enumC8302kM20706a = EnumC8302k.m20706a(c8303l.f18550a);
            if (enumC8302kM20706a == null) {
                throw new C8225b("Found invalid creative type: " + c8303l.f18550a, 32);
            }
            m20631a(c8293b, EnumC8300i.Static, i, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, c8303l.f18551b, enumC8302kM20706a);
        }
        String str4 = c8299h.f18543e;
        if (!TextUtils.isEmpty(str4)) {
            if (!AbstractC9154h0.m21970f(str4)) {
                throw new C8225b("Found non-secure iframe url: " + str4, 0);
            }
            m20631a(c8293b, EnumC8300i.Iframe, i, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, str4, null);
        }
        String str5 = c8299h.f18544f;
        if (TextUtils.isEmpty(str5)) {
            c8293b2 = c8293b;
        } else {
            c8293b2 = c8293b;
            m20631a(c8293b2, EnumC8300i.Html, i, num.intValue(), num2.intValue(), str3, str2, arrayList, arrayList2, str5, null);
        }
        c8293b2.f18505g.size();
    }

    /* JADX INFO: renamed from: a */
    public final void m20631a(C8293b c8293b, EnumC8300i enumC8300i, int i, int i2, int i3, String str, String str2, List list, List list2, String str3, EnumC8302k enumC8302k) {
        C8299h c8299h;
        Integer num;
        Integer num2;
        C8294c c8294c = new C8294c(enumC8300i, i2, i3, str, i);
        c8294c.f18521g = str2;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C8314w c8314w = (C8314w) it.next();
                c8294c.m20701a(EnumC8315x.m20711a(c8314w.f18582a), c8314w.f18583b);
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c8294c.m20701a(EnumC8315x.EVENT_CLICK, (String) it2.next());
            }
        }
        if (!this.f18343i.isEmpty()) {
            if (c8294c.f18522h > 0) {
                ArrayList arrayList = this.f18343i;
                c8299h = (C8299h) arrayList.remove(arrayList.size() - 1);
            } else {
                c8299h = null;
            }
            String str4 = c8294c.f18519e;
            for (C8299h c8299h2 : this.f18343i) {
                String str5 = c8299h2.f18541c;
                if ((str4 != null && str4.equals(str5)) || ((str5 == null && (num = c8299h2.f18539a) != null && c8294c.f18517c == num.intValue() && (num2 = c8299h2.f18540b) != null && c8294c.f18518d == num2.intValue()) || !c8299h2.m20705a())) {
                    ArrayList<String> arrayList2 = c8299h2.f18546h;
                    if (arrayList2.size() > 0) {
                        for (String str6 : arrayList2) {
                            if (AbstractC9154h0.m21970f(str6)) {
                                c8294c.m20701a(EnumC8315x.EVENT_CLICK, str6);
                            }
                        }
                    }
                }
            }
            if (c8299h != null) {
                this.f18343i.add(c8299h);
            }
        }
        c8294c.f18520f = str3;
        c8294c.f18516b = enumC8302k;
        c8293b.f18505g.add(c8294c);
        c8293b.f18510l.add(c8294c);
    }
}
