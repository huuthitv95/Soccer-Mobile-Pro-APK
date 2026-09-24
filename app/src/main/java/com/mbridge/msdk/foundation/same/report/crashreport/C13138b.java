package com.mbridge.msdk.foundation.same.report.crashreport;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.crashreport.b */
/* JADX INFO: compiled from: AbnormalExitUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13138b {
    /* JADX INFO: renamed from: a */
    public static List<String> m37293a() {
        ArrayList arrayList = new ArrayList();
        try {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d == null) {
                c13635gM39718d = C13636h.m39706b().m39708a();
            }
            Matcher matcher = Pattern.compile("<mvpackage>([^<]+)</mvpackage>").matcher(c13635gM39718d.m39436Q());
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                if (!TextUtils.isEmpty(strGroup)) {
                    String[] strArrSplit = strGroup.split(",");
                    if (strArrSplit.length > 0) {
                        arrayList.addAll(Arrays.asList(strArrSplit));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add("mbridge");
            }
            return arrayList;
        } catch (Exception e) {
            C13219q0.m37816b("FilterStringUtil", e.getMessage());
            arrayList.clear();
            arrayList.add("mbridge");
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m37294a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d == null) {
                return jSONObject;
            }
            float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
            float f = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
            float fFreeMemory = (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d);
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            long usableSpace = externalStorageDirectory.getUsableSpace();
            long totalSpace = externalStorageDirectory.getTotalSpace();
            String fileSize = Formatter.formatFileSize(contextM36542d, usableSpace);
            String fileSize2 = Formatter.formatFileSize(contextM36542d, totalSpace);
            jSONObject.put("max_memory", String.valueOf(fMaxMemory));
            jSONObject.put("memoryby_app", String.valueOf(f));
            jSONObject.put("remaining_memory", fFreeMemory);
            jSONObject.put("sdcard_remainder", fileSize);
            jSONObject.put("totalspacestr", fileSize2);
            jSONObject.put("crashtime", str);
            return jSONObject;
        } catch (Throwable th) {
            C13219q0.m37816b("AbnormalExitUtil", th.getMessage());
            return jSONObject;
        }
    }
}
