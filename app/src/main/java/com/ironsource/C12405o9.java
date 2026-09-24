package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.C12367p;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BuildConfig;

/* JADX INFO: renamed from: com.ironsource.o9 */
/* JADX INFO: loaded from: classes6.dex */
class C12405o9 {

    /* JADX INFO: renamed from: a */
    private static final String f31624a = "IntegrationHelper";

    /* JADX INFO: renamed from: b */
    private static final String f31625b = "getNetworkSDKVersion";

    /* JADX INFO: renamed from: c */
    private static final String f31626c = "getAdapterSDKVersion";

    /* JADX INFO: renamed from: d */
    private static final String f31627d = "getAdapterVersion";

    /* JADX INFO: renamed from: e */
    private static final String f31628e = "getVersion";

    /* JADX INFO: renamed from: com.ironsource.o9$a */
    class a extends Thread {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f31629a;

        a(Context context) {
            this.f31629a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C12405o9.f31624a, "--------------- Google Play Services --------------");
                if (!this.f31629a.getPackageManager().getApplicationInfo(this.f31629a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(C12405o9.f31624a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(C12405o9.f31624a, "Google Play Services - VERIFIED");
                String strMo27297b = C12367p.m32628h().mo27297b(this.f31629a);
                if (TextUtils.isEmpty(strMo27297b)) {
                    return;
                }
                Log.i(C12405o9.f31624a, "GAID is: " + strMo27297b + " (use this for test devices)");
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                Log.e(C12405o9.f31624a, "Google Play Services - MISSING");
            }
        }
    }

    C12405o9() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX INFO: renamed from: a */
    private static boolean m32960a(Context context, String str) {
        byte b;
        Object objNewInstance;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -805296079) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                } else if (lowerCase.equals("admob")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (lowerCase.equals("vungle")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                Log.i(f31624a, "--------------- Meta --------------");
            } else if (b == 1) {
                Log.i(f31624a, "--------------- Google (AdMob and Ad Manager) --------------");
            } else if (b != 2) {
                Log.i(f31624a, "--------------- " + str + " --------------");
            } else {
                Log.i(f31624a, "--------------- Liftoff Monetization --------------");
            }
            try {
                Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                try {
                    objNewInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                } catch (NoSuchMethodException unused) {
                    objNewInstance = cls.getConstructor(null).newInstance(null);
                }
                m32962b(objNewInstance);
                m32959a(objNewInstance);
                return true;
            } catch (ClassNotFoundException e) {
                C12317m4.m32153d().m32155a(e);
                Log.e(f31624a, "Adapter - MISSING");
                return false;
            } catch (Exception e2) {
                C12317m4.m32153d().m32155a(e2);
                Log.e(f31624a, "Failed to instantiate adapter");
                return false;
            }
        } catch (Exception e3) {
            C12317m4.m32153d().m32155a(e3);
            Log.e(f31624a, "isAdapterValid " + str, e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    static void m32961b(Context context) {
        Log.i(f31624a, "Verifying Integration:");
        m32963c(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", C11540L6.f24919H1, "Verve", "Yandex", "YSO"};
        for (int i = 0; i < 26; i++) {
            String str = strArr[i];
            if (!m32960a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.hashCode();
                lowerCase.hashCode();
                switch (lowerCase) {
                    case "vungle":
                        Log.i(f31624a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case "admob":
                        Log.i(f31624a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case "facebook":
                        Log.i(f31624a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        Log.e(f31624a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.hashCode();
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                        }
                        break;
                    case 92668925:
                        if (lowerCase2.equals("admob")) {
                        }
                        break;
                    case 497130182:
                        if (!lowerCase2.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instruction units count: 322
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C12405o9.m32961b(android.content.Context):void");
            }

            /* JADX INFO: renamed from: c */
            private static void m32963c(Context context) {
                Log.i(f31624a, "*** Permissions ***");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
                    Log.i(f31624a, "android.permission.INTERNET - VERIFIED");
                } else {
                    Log.e(f31624a, "android.permission.INTERNET - MISSING");
                }
                if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    Log.i(f31624a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
                } else {
                    Log.e(f31624a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
                }
            }

            /* JADX INFO: renamed from: a */
            private static void m32958a(Context context) {
                new a(context).start();
            }

            /* JADX INFO: renamed from: b */
            private static void m32962b(Object obj) {
                String str;
                try {
                    Class<?> cls = obj.getClass();
                    if (obj instanceof LevelPlayBaseAdapter) {
                        str = f31625b;
                    } else {
                        str = f31626c;
                    }
                    Log.i(f31624a, "SDK Version - " + ((String) cls.getMethod(str, null).invoke(obj, null)));
                } catch (Exception e) {
                    C12317m4.m32153d().m32155a(e);
                    Log.w(f31624a, "Unable to get SDK version");
                }
            }

            /* JADX INFO: renamed from: a */
            private static void m32959a(Object obj) {
                try {
                    Log.i(f31624a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f31627d : "getVersion", null).invoke(obj, null)));
                } catch (Exception e) {
                    C12317m4.m32153d().m32155a(e);
                    Log.w(f31624a, "Unable to get adapter version");
                }
            }
        }
