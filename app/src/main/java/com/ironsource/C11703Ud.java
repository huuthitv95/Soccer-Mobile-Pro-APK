package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.Ud */
/* JADX INFO: loaded from: classes6.dex */
public class C11703Ud {

    /* JADX INFO: renamed from: a */
    public static a f25962a = new a(2001, m27627a("initsdk"));

    /* JADX INFO: renamed from: b */
    public static a f25963b = new a(2026, m27627a("sdkrecoverstart"));

    /* JADX INFO: renamed from: c */
    public static a f25964c = new a(2002, m27627a("createcontrollerweb"));

    /* JADX INFO: renamed from: d */
    public static a f25965d = new a(2003, m27627a("createcontrollernative"));

    /* JADX INFO: renamed from: e */
    public static a f25966e = new a(2004, m27627a("controllerstageready"));

    /* JADX INFO: renamed from: f */
    public static a f25967f = new a(2005, m27627a("loadad"));

    /* JADX INFO: renamed from: g */
    public static a f25968g = new a(2006, m27627a("loadadfailed"));

    /* JADX INFO: renamed from: h */
    public static a f25969h = new a(2007, m27627a("initproduct"));

    /* JADX INFO: renamed from: i */
    public static a f25970i = new a(2008, m27627a("initproductfailed"));

    /* JADX INFO: renamed from: j */
    public static a f25971j = new a(2009, m27627a("loadproduct"));

    /* JADX INFO: renamed from: k */
    public static a f25972k = new a(2010, m27627a("parseadmfailed"));

    /* JADX INFO: renamed from: l */
    public static a f25973l = new a(2011, m27627a("loadadsuccess"));

    /* JADX INFO: renamed from: m */
    public static a f25974m = new a(2027, m27627a("destroyproduct"));

    /* JADX INFO: renamed from: n */
    public static a f25975n = new a(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, m27627a("registerad"));

    /* JADX INFO: renamed from: o */
    public static a f25976o = new a(2013, m27627a("controllerfailed"));

    /* JADX INFO: renamed from: p */
    public static a f25977p = new a(2015, m27627a("appendnativefeaturesdatafailed"));

    /* JADX INFO: renamed from: q */
    public static a f25978q = new a(2016, m27627a("adunitcouldnotloadtowebview"));

    /* JADX INFO: renamed from: r */
    public static a f25979r = new a(2017, m27627a("webviewcleanupfailed"));

    /* JADX INFO: renamed from: s */
    public static a f25980s = new a(2018, m27627a("removewebviewfailed"));

    /* JADX INFO: renamed from: t */
    public static a f25981t = new a(IronSourceError.ERROR_NEW_INIT_API_ALREADY_CALLED, m27627a("banneralreadydestroyed"));

    /* JADX INFO: renamed from: u */
    public static a f25982u = new a(2021, m27627a("fialedregactlifecycle"));

    /* JADX INFO: renamed from: v */
    public static a f25983v = new a(2022, m27627a("loadcontrollerhtml"));

    /* JADX INFO: renamed from: w */
    public static a f25984w = new a(2023, m27627a("controllerhtmlsuccess"));

    /* JADX INFO: renamed from: x */
    public static a f25985x = new a(2024, m27627a("controllerhtmlfailed"));

    /* JADX INFO: renamed from: y */
    public static a f25986y = new a(2025, m27627a("webviewcrashrpg"));

    /* JADX INFO: renamed from: z */
    public static a f25987z = new a(2031, m27627a("getorientationcalled"));

    /* JADX INFO: renamed from: A */
    public static a f25959A = new a(2032, m27627a("webviewunavailable"));

    /* JADX INFO: renamed from: B */
    public static final a f25960B = new a(2033, m27627a("controller_init_delayed"));

    /* JADX INFO: renamed from: C */
    public static a f25961C = new a(2034, m27627a("loadControllerHtmlFromBundle"));

    /* JADX INFO: renamed from: com.ironsource.Ud$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        String f25988a;

        /* JADX INFO: renamed from: b */
        int f25989b;

        a(int i, String str) {
            this.f25989b = i;
            this.f25988a = str;
        }
    }

    /* JADX INFO: renamed from: a */
    static String m27627a(String str) {
        return C11341A5.f23812c + str;
    }
}
