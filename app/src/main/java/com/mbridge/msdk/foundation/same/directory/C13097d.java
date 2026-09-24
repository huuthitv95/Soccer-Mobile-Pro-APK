package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.directory.d */
/* JADX INFO: compiled from: MBridgeDirContext.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13097d extends AbstractC13095b {
    public C13097d(String str) {
        super(str);
    }

    @Override // com.mbridge.msdk.foundation.same.directory.AbstractC13095b
    /* JADX INFO: renamed from: b */
    protected List<C13094a> mo37143b() {
        ArrayList<C13094a> arrayList = new ArrayList<>();
        m37142a(arrayList, EnumC13096c.MBRIDGE_RES_MANAGER_DIR, "mb/res");
        m37142a(arrayList, EnumC13096c.AD_MOVIES, "mb/res/Movies").m37134a(EnumC13096c.MBRIDGE_VC, "mb/res/.MBridge_VC");
        C13094a c13094aM37142a = m37142a(arrayList, EnumC13096c.AD_MBRIDGE_700, "mb/res/.mbridge700");
        c13094aM37142a.m37134a(EnumC13096c.MBRIDGE_700_IMG, "mb/res/img");
        c13094aM37142a.m37134a(EnumC13096c.MBRIDGE_700_IMG_PICASSO, "mb/res/picasso");
        c13094aM37142a.m37134a(EnumC13096c.MBRIDGE_700_RES, "mb/res/res");
        c13094aM37142a.m37134a(EnumC13096c.MBRIDGE_700_HTML, "mb/res/html");
        c13094aM37142a.m37134a(EnumC13096c.MBRIDGE_700_XML, "mb/res/xml");
        c13094aM37142a.m37134a(EnumC13096c.MBRIDGE_700_CONFIG, "mb/config");
        EnumC13096c enumC13096c = EnumC13096c.MBRIDGE_OTHER;
        m37142a(arrayList, enumC13096c, "mb/other");
        m37142a(arrayList, EnumC13096c.MBRIDGE_CRASH_INFO, "mb/crashinfo");
        m37142a(arrayList, enumC13096c, "mb/other");
        return arrayList;
    }
}
