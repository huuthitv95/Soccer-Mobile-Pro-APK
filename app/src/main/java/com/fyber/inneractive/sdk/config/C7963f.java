package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.cache.InterfaceC7899a;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.remote.C8029a;
import com.fyber.inneractive.sdk.config.remote.C8030b;
import com.fyber.inneractive.sdk.config.remote.C8033e;
import com.fyber.inneractive.sdk.config.remote.C8034f;
import com.fyber.inneractive.sdk.config.remote.C8036h;
import com.fyber.inneractive.sdk.config.remote.C8037i;
import com.fyber.inneractive.sdk.config.remote.C8038j;
import com.fyber.inneractive.sdk.config.remote.C8039k;
import com.fyber.inneractive.sdk.config.remote.InterfaceC8031c;
import com.fyber.inneractive.sdk.config.remote.InterfaceC8032d;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tiktok.util.UrlConst;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C7963f implements InterfaceC7899a {

    /* JADX INFO: renamed from: a */
    public boolean f17726a = false;

    /* JADX INFO: renamed from: a */
    public static C8008h0 m20396a(C8033e c8033e) {
        int i;
        boolean z;
        C8008h0 c8008h0;
        Iterator it;
        ArrayList arrayList;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        String strMo20449b;
        C8033e c8033e2 = c8033e;
        C8008h0 c8008h1 = new C8008h0();
        c8008h1.f17781c = c8033e2.f17831c;
        C8029a c8029a = c8033e2.f17829a;
        c8008h1.f17780b = c8029a.f17819b;
        c8008h1.f17779a = c8029a.f17818a;
        Iterator it2 = c8033e2.f17830b.iterator();
        while (it2.hasNext()) {
            C8036h c8036h = (C8036h) it2.next();
            HashMap map = c8008h1.f17782d;
            String str = c8036h.f17833a;
            C8029a c8029a2 = c8033e2.f17829a;
            HashMap map2 = c8008h1.f17783e;
            C8012j0 c8012j0 = c8008h1.f17784f;
            C8026q0 c8026q0 = new C8026q0();
            int i2 = 2;
            int i3 = 0;
            int i4 = 1;
            InterfaceC8031c[] interfaceC8031cArr = {c8029a2, c8036h};
            int i5 = 0;
            while (true) {
                if (i5 >= i2) {
                    i = i2;
                    z = true;
                    break;
                }
                InterfaceC8031c interfaceC8031c = interfaceC8031cArr[i5];
                if (interfaceC8031c != null && (strMo20449b = interfaceC8031c.mo20449b()) != null) {
                    i = i2;
                    if (strMo20449b.equals("false")) {
                        z = false;
                        break;
                    }
                } else {
                    i = i2;
                }
                i5++;
                i2 = i;
            }
            c8026q0.f17810b = z;
            Iterator it3 = c8036h.f17839g.iterator();
            while (it3.hasNext()) {
                C8037i c8037i = (C8037i) it3.next();
                C8028r0 c8028r0 = new C8028r0();
                String str2 = c8037i.f17840a;
                if (str2 != null) {
                    int i6 = i3;
                    String str3 = c8037i.f17841b;
                    if (str3 == null) {
                        i3 = i6;
                    } else {
                        c8028r0.f17811a = str2;
                        c8028r0.f17812b = str3;
                        C8030b c8030b = c8037i.f17842c;
                        int i7 = i4;
                        if (c8030b != null) {
                            C8030b c8030b2 = c8036h.f17835c;
                            C8030b c8030b3 = c8029a2.f17822e;
                            C8016l0 c8016l0 = new C8016l0();
                            c8008h0 = c8008h1;
                            UnitDisplayType unitDisplayType3 = c8030b.f17825a;
                            it = it2;
                            if (unitDisplayType3 == UnitDisplayType.BANNER || unitDisplayType3 == UnitDisplayType.MRECT || unitDisplayType3.isFullscreenUnit()) {
                                c8016l0.f17798b = c8030b.f17825a;
                                Integer num = c8030b.f17827c;
                                Integer num2 = c8030b2 != null ? c8030b2.f17827c : null;
                                Integer num3 = c8030b3 != null ? c8030b3.f17827c : null;
                                Integer num4 = num2;
                                Object[] objArr = new Object[3];
                                objArr[i6] = num;
                                objArr[i7] = num4;
                                objArr[i] = num3;
                                Integer num5 = (Integer) m20397a((Object) null, objArr);
                                if (num5 != null && num5.intValue() >= 5 && num5.intValue() <= 60) {
                                    c8016l0.f17797a = num5;
                                }
                                Boolean bool = Boolean.TRUE;
                                Boolean bool2 = c8030b.f17826b;
                                Boolean bool3 = c8030b2 != null ? c8030b2.f17826b : null;
                                Boolean bool4 = c8030b3 != null ? c8030b3.f17826b : null;
                                Boolean bool5 = bool3;
                                Object[] objArr2 = new Object[3];
                                objArr2[i6] = bool2;
                                objArr2[i7] = bool5;
                                objArr2[i] = bool4;
                                Boolean bool6 = (Boolean) m20397a(bool, objArr2);
                                bool6.getClass();
                                c8016l0.f17799c = bool6;
                                Integer num6 = c8030b.f17828d;
                                Integer num7 = c8030b2 != null ? c8030b2.f17828d : null;
                                Integer num8 = c8030b3 != null ? c8030b3.f17828d : null;
                                Object[] objArr3 = new Object[3];
                                objArr3[i6] = num6;
                                objArr3[i7] = num7;
                                objArr3[i] = num8;
                                Integer num9 = (Integer) m20397a((Object) null, objArr3);
                                if (num9 != null && num9.intValue() >= 5 && num9.intValue() <= 60) {
                                    c8016l0.f17800d = num9;
                                }
                                if (c8016l0.f17800d == null && !c8016l0.f17799c.booleanValue() && ((unitDisplayType2 = c8030b.f17825a) == UnitDisplayType.INTERSTITIAL || unitDisplayType2 == UnitDisplayType.REWARDED)) {
                                    c8016l0.f17799c = bool;
                                }
                                c8028r0.f17813c = c8016l0;
                            } else {
                                i3 = i6;
                                i4 = i7;
                                c8008h1 = c8008h0;
                                it2 = it;
                            }
                        } else {
                            c8008h0 = c8008h1;
                            it = it2;
                        }
                        C8038j c8038j = c8037i.f17845f;
                        if (c8038j != null || c8037i.f17844e != null) {
                            if (c8038j != null) {
                                UnitDisplayType unitDisplayType4 = c8038j.f17856j;
                                UnitDisplayType unitDisplayType5 = UnitDisplayType.REWARDED;
                                if (unitDisplayType4 == unitDisplayType5 && c8037i.f17842c == null) {
                                    C8016l0 c8016l1 = new C8016l0();
                                    c8028r0.f17813c = c8016l1;
                                    c8016l1.f17799c = Boolean.FALSE;
                                    c8016l1.f17800d = -1;
                                    C8016l0 c8016l2 = c8028r0.f17813c;
                                    c8016l2.f17798b = unitDisplayType5;
                                    c8016l2.f17797a = -1;
                                }
                            }
                            C8043t0 c8043t0 = new C8043t0();
                            C8038j c8038j2 = c8037i.f17845f;
                            C8038j c8038j3 = c8036h.f17837e;
                            C8038j c8038j4 = c8029a2.f17821d;
                            if (c8038j2 == null || !((unitDisplayType = c8038j2.f17856j) == UnitDisplayType.LANDSCAPE || unitDisplayType == UnitDisplayType.SQUARE || unitDisplayType == UnitDisplayType.INTERSTITIAL || unitDisplayType == UnitDisplayType.VERTICAL || unitDisplayType == UnitDisplayType.REWARDED || unitDisplayType == UnitDisplayType.MRECT)) {
                                if (c8037i.f17844e != null) {
                                    c8043t0.f17876j = UnitDisplayType.NATIVE;
                                    c8028r0.f17815e = new C8024p0();
                                }
                                i3 = i6;
                                i4 = i7;
                                c8008h1 = c8008h0;
                                it2 = it;
                                it3 = it3;
                            } else {
                                c8043t0.f17876j = unitDisplayType;
                            }
                            Boolean bool7 = c8038j2 != null ? c8038j2.f17847a : null;
                            Boolean bool8 = c8038j3 != null ? c8038j3.f17847a : null;
                            Boolean bool9 = c8038j4 != null ? c8038j4.f17847a : null;
                            Boolean bool10 = bool8;
                            Object[] objArr4 = new Object[3];
                            objArr4[i6] = bool7;
                            objArr4[i7] = bool10;
                            objArr4[i] = bool9;
                            Object objM20397a = m20397a((Object) null, objArr4);
                            if (objM20397a != null) {
                                c8043t0.f17867a = (Boolean) objM20397a;
                                Integer num10 = c8038j2 != null ? c8038j2.f17848b : null;
                                Integer num11 = c8038j3 != null ? c8038j3.f17848b : null;
                                Integer num12 = c8038j4 != null ? c8038j4.f17848b : null;
                                Integer num13 = num10;
                                Object[] objArr5 = new Object[3];
                                objArr5[i6] = num13;
                                objArr5[i7] = num11;
                                objArr5[i] = num12;
                                c8043t0.f17868b = (Integer) m20397a((Object) 5000, objArr5);
                                Integer numValueOf = Integer.valueOf(i6);
                                Integer num14 = c8038j2 != null ? c8038j2.f17849c : null;
                                Integer num15 = c8038j3 != null ? c8038j3.f17849c : null;
                                Integer num16 = c8038j4 != null ? c8038j4.f17849c : null;
                                Integer num17 = num15;
                                Object[] objArr6 = new Object[3];
                                objArr6[i6] = num14;
                                objArr6[i7] = num17;
                                objArr6[i] = num16;
                                Integer num18 = (Integer) m20397a(numValueOf, objArr6);
                                c8043t0.f17869c = Integer.valueOf(num18.intValue() < 0 ? i6 : num18.intValue());
                                Boolean bool11 = Boolean.TRUE;
                                Boolean bool12 = c8038j2 != null ? c8038j2.f17851e : null;
                                Boolean bool13 = c8038j3 != null ? c8038j3.f17851e : null;
                                Boolean bool14 = c8038j4 != null ? c8038j4.f17851e : null;
                                Boolean bool15 = bool13;
                                Object[] objArr7 = new Object[3];
                                objArr7[i6] = bool12;
                                objArr7[i7] = bool15;
                                objArr7[i] = bool14;
                                c8043t0.f17870d = (Boolean) m20397a(bool11, objArr7);
                                Orientation orientation = Orientation.USER;
                                Orientation orientation2 = c8038j2 != null ? c8038j2.f17853g : null;
                                Orientation orientation3 = c8038j3 != null ? c8038j3.f17853g : null;
                                Orientation orientation4 = c8038j4 != null ? c8038j4.f17853g : null;
                                Orientation orientation5 = orientation3;
                                Object[] objArr8 = new Object[3];
                                objArr8[i6] = orientation2;
                                objArr8[i7] = orientation5;
                                objArr8[i] = orientation4;
                                c8043t0.f17871e = (Orientation) m20397a(orientation, objArr8);
                                Integer numValueOf2 = Integer.valueOf(i6);
                                Integer num19 = c8038j2 != null ? c8038j2.f17855i : null;
                                Integer num20 = c8038j3 != null ? c8038j3.f17855i : null;
                                Integer num21 = c8038j4 != null ? c8038j4.f17855i : null;
                                Integer num22 = num20;
                                Object[] objArr9 = new Object[3];
                                objArr9[i6] = num19;
                                objArr9[i7] = num22;
                                objArr9[i] = num21;
                                Integer num23 = (Integer) m20397a(numValueOf2, objArr9);
                                c8043t0.f17872f = Integer.valueOf(num23.intValue() < 0 ? i6 : num23.intValue());
                                Integer num24 = c8038j2 != null ? c8038j2.f17854h : null;
                                Integer num25 = c8038j3 != null ? c8038j3.f17854h : null;
                                Integer num26 = c8038j4 != null ? c8038j4.f17854h : null;
                                Integer num27 = num25;
                                Object[] objArr10 = new Object[3];
                                objArr10[i6] = num24;
                                objArr10[i7] = num27;
                                objArr10[i] = num26;
                                Integer num28 = (Integer) m20397a((Object) 2048, objArr10);
                                if (num28.intValue() > c8043t0.f17868b.intValue()) {
                                    num28 = c8043t0.f17868b;
                                }
                                c8043t0.f17873g = num28;
                                Skip skip = Skip._0;
                                Skip skip2 = c8038j2 != null ? c8038j2.f17850d : null;
                                Skip skip3 = c8038j3 != null ? c8038j3.f17850d : null;
                                Skip skip4 = c8038j4 != null ? c8038j4.f17850d : null;
                                Skip skip5 = skip3;
                                Object[] objArr11 = new Object[3];
                                objArr11[i6] = skip2;
                                objArr11[i7] = skip5;
                                objArr11[i] = skip4;
                                c8043t0.f17874h = (Skip) m20397a(skip, objArr11);
                                TapAction tapAction = TapAction.DO_NOTHING;
                                TapAction tapAction2 = c8038j2 != null ? c8038j2.f17852f : null;
                                TapAction tapAction3 = c8038j3 != null ? c8038j3.f17852f : null;
                                TapAction tapAction4 = c8038j4 != null ? c8038j4.f17852f : null;
                                Object[] objArr12 = new Object[3];
                                objArr12[i6] = tapAction2;
                                objArr12[i7] = tapAction3;
                                objArr12[i] = tapAction4;
                                c8043t0.f17875i = (TapAction) m20397a(tapAction, objArr12);
                                ArrayList arrayList2 = new ArrayList();
                                InterfaceC8032d[] interfaceC8032dArr = new InterfaceC8032d[i7];
                                interfaceC8032dArr[i6] = c8037i;
                                C8038j c8038jMo20448a = interfaceC8032dArr[i6].mo20448a();
                                if (c8038jMo20448a != null && (arrayList = c8038jMo20448a.f17857k) != null && arrayList.size() > 0) {
                                    arrayList2 = c8038jMo20448a.f17857k;
                                }
                                c8043t0.f17877k = arrayList2;
                                c8028r0.f17816f = c8043t0;
                            } else {
                                i3 = i6;
                                i4 = i7;
                                c8008h1 = c8008h0;
                                it2 = it;
                                it3 = it3;
                            }
                        }
                        C8022o0 c8022o0 = new C8022o0();
                        HashSet hashSet = new HashSet();
                        C8034f c8034f = c8037i.f17843d;
                        Set set = c8034f != null ? c8034f.f17832a : null;
                        C8034f c8034f2 = c8036h.f17836d;
                        Set set2 = c8034f2 != null ? c8034f2.f17832a : null;
                        C8034f c8034f3 = c8029a2.f17820c;
                        Set set3 = c8034f3 != null ? c8034f3.f17832a : null;
                        Object[] objArr13 = new Object[3];
                        objArr13[i6] = set;
                        objArr13[1] = set2;
                        objArr13[i] = set3;
                        c8022o0.f17806a = (Set) m20397a(hashSet, objArr13);
                        c8028r0.f17814d = c8022o0;
                        C8045u0 c8045u0 = new C8045u0();
                        C8039k c8039k = c8037i.f17846g;
                        C8039k c8039k2 = c8036h.f17838f;
                        C8039k c8039k3 = c8029a2.f17823f;
                        Integer num29 = c8039k != null ? c8039k.f17858a : null;
                        Integer num30 = c8039k2 != null ? c8039k2.f17858a : null;
                        Integer num31 = c8039k3 != null ? c8039k3.f17858a : null;
                        C8036h c8036h2 = c8036h;
                        C8029a c8029a3 = c8029a2;
                        Object[] objArr14 = new Object[3];
                        objArr14[i6] = num29;
                        objArr14[1] = num30;
                        objArr14[i] = num31;
                        Integer num32 = (Integer) m20397a((Object) 1, objArr14);
                        if (num32.intValue() > 0 || num32.intValue() <= 100) {
                            c8045u0.f17879a = num32;
                        } else {
                            c8045u0.f17879a = 1;
                        }
                        Integer numValueOf3 = Integer.valueOf(i6);
                        Integer num33 = c8039k != null ? c8039k.f17859b : null;
                        Integer num34 = c8039k2 != null ? c8039k2.f17859b : null;
                        Integer num35 = c8039k3 != null ? c8039k3.f17859b : null;
                        Object[] objArr15 = new Object[3];
                        objArr15[i6] = num33;
                        objArr15[1] = num34;
                        objArr15[i] = num35;
                        Integer num36 = (Integer) m20397a(numValueOf3, objArr15);
                        if (num36.intValue() >= 0 || num36.intValue() <= 100) {
                            c8045u0.f17880b = num36;
                        } else {
                            c8045u0.f17880b = Integer.valueOf(i6);
                        }
                        HashSet hashSet2 = new HashSet();
                        Set set4 = c8039k != null ? c8039k.f17860c : null;
                        Set set5 = c8039k2 != null ? c8039k2.f17860c : null;
                        Set set6 = c8039k3 != null ? c8039k3.f17860c : null;
                        Object[] objArr16 = new Object[3];
                        objArr16[i6] = set4;
                        objArr16[1] = set5;
                        objArr16[i] = set6;
                        Set<Vendor> set7 = (Set) m20397a(hashSet2, objArr16);
                        c8045u0.f17881c = set7;
                        c8028r0.f17817g = c8045u0;
                        if (c8012j0 != null && set7 != null) {
                            for (Vendor vendor : set7) {
                                if (vendor != null && !c8012j0.f17787a.contains(vendor)) {
                                    c8012j0.f17787a.add(vendor);
                                }
                            }
                        }
                        c8026q0.f17809a.add(c8028r0);
                        map2.put(c8028r0.f17811a, c8028r0);
                        i3 = i6;
                        i4 = 1;
                        c8008h1 = c8008h0;
                        it2 = it;
                        c8036h = c8036h2;
                        it3 = it3;
                        c8029a2 = c8029a3;
                    }
                }
            }
            map.put(str, c8026q0);
            c8033e2 = c8033e;
        }
        return c8008h1;
    }

    /* JADX INFO: renamed from: a */
    public static Object m20397a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final Object mo20349a(String str) {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            iAConfigManager.f17659C.m20408g();
            C8033e c8033eM20451a = C8033e.m20451a(new JSONObject(str));
            String str2 = iAConfigManager.f17671c;
            if (c8033eM20451a != null && str2.equals(c8033eM20451a.f17829a.f17818a)) {
                return m20396a(c8033eM20451a);
            }
            IAlog.m21946b("internal error while parsing local configuration", new Object[0]);
            if (c8033eM20451a != null && !str2.equals(c8033eM20451a.f17829a.f17818a)) {
                throw new InvalidAppIdException();
            }
            m20398a(str, (Throwable) null);
            return null;
        } catch (Throwable th) {
            m20398a(str, th);
            IAlog.m21946b("Exception Error while parsing local configuration", new Object[0]);
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final String mo20350a() {
        String str = IAConfigManager.f17654M.f17671c;
        StringBuilder sb = new StringBuilder(UrlConst.HTTPS);
        int i = AbstractC8013k.f17788a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb.append(property);
        }
        sb.append(str);
        sb.append('/');
        sb.append(str);
        sb.append(".json");
        String string = sb.toString();
        IAlog.m21948d("%s: %s", "APP_CONFIG_REQUEST", string);
        return string;
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: a */
    public final void mo20351a(Object obj) {
        C8008h0 c8008h0 = (C8008h0) obj;
        if (c8008h0 == null || c8008h0.f17779a == null) {
            return;
        }
        AbstractC9174o.f21470a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", c8008h0.f17779a).apply();
    }

    /* JADX INFO: renamed from: a */
    public final void m20398a(String str, Throwable th) {
        String strSubstring;
        String name;
        String localizedMessage;
        if (this.f17726a) {
            return;
        }
        this.f17726a = true;
        if (TextUtils.isEmpty(str)) {
            strSubstring = "Empty Json Data";
        } else {
            strSubstring = str.substring(0, str.length() > 501 ? 500 : str.length() - 1);
        }
        if (th != null) {
            name = th.getClass().getName();
            localizedMessage = th.getLocalizedMessage();
        } else {
            name = "Bad remote configuration";
            localizedMessage = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        String str2 = IAConfigManager.f17654M.f17671c;
        C8428w c8428w = new C8428w(EnumC8415t.FATAL_CONFIGURATION_ERROR);
        if (localizedMessage == null) {
            localizedMessage = "No message";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "EMPTY_APP_ID";
        }
        c8428w.m20807a("exception", name, "message", localizedMessage, "data", strSubstring, RemoteConfigConstants.RequestFieldKey.APP_ID, str2).m20808a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: b */
    public final String mo20352b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: c */
    public final String mo20353c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.InterfaceC7899a
    /* JADX INFO: renamed from: d */
    public final boolean mo20354d() {
        String string = AbstractC9174o.f21470a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.f17654M.f17671c);
    }
}
