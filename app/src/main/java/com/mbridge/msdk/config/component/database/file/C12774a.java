package com.mbridge.msdk.config.component.database.file;

import android.text.TextUtils;
import com.ironsource.C11661S5;
import com.mbridge.msdk.config.component.database.C12771a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.database.file.a */
/* JADX INFO: compiled from: FileOperate.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12774a {

    /* JADX INFO: renamed from: a */
    final String f34012a = "FileOperate";

    /* JADX INFO: renamed from: a */
    public void m35223a(String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, Object> mapM35217d = C12771a.m35212a().m35217d(str.startsWith("DELETE") ? str.replaceFirst("DELETE", "SELECT") : str.startsWith("delete") ? str.replaceFirst("delete", "SELECT") : "");
        if (mapM35217d == null || mapM35217d.isEmpty() || !(mapM35217d.get("data") instanceof List) || (arrayList = (ArrayList) mapM35217d.get("data")) == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                if (((String) entry.getKey()).equals(C11661S5.c.f25654c)) {
                    arrayList2.add(String.valueOf(entry.getValue()));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            m35222a(new File((String) it2.next()));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m35222a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m35222a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }
}
