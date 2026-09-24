package com.bytedance.sdk.component.adexpress.p126ri.p128lr;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2518ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.utils.C2717fi;
import com.bytedance.sdk.component.utils.ory;
import com.bytedance.sdk.component.xha.C2739lr;
import com.bytedance.sdk.component.xha.p170lr.C2743ri;
import com.ironsource.C11341A5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ri.lr.ik */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2521ik {
    /* JADX INFO: renamed from: ik */
    public static boolean m9085ik(C2518ri c2518ri, C2518ri c2518ri2) {
        if (c2518ri != null) {
            try {
                if (!TextUtils.isEmpty(c2518ri.m9038ik())) {
                    if (c2518ri2 == null) {
                        return false;
                    }
                    String strXha = c2518ri.xha();
                    String strXha2 = c2518ri2.xha();
                    if ((!TextUtils.isEmpty(strXha2) && !strXha2.equals(strXha)) || m9089ri(c2518ri.m9038ik(), c2518ri2.m9038ik())) {
                        return true;
                    }
                    Map<String, C2518ri> mapM9046ri = c2518ri.m9046ri();
                    Map<String, C2518ri> mapM9046ri2 = c2518ri2.m9046ri();
                    if (mapM9046ri.isEmpty()) {
                        return !mapM9046ri2.isEmpty();
                    }
                    if (mapM9046ri2.isEmpty()) {
                        return false;
                    }
                    return m9091ri(mapM9046ri, mapM9046ri2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: lr */
    public static void m9086lr(File file, C2518ri c2518ri, String str) {
        if (c2518ri == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (c2518ri.m9036di() != null) {
            Iterator<C2518ri.ri> it = c2518ri.m9036di().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, C2717fi.m10220ri(it.next().m9060ri())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9087ri(File file, C2518ri c2518ri, String str) {
        FileOutputStream fileOutputStream;
        if (c2518ri == null) {
            return;
        }
        String strM9045qt = c2518ri.m9045qt();
        if (TextUtils.isEmpty(strM9045qt)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
                try {
                    fileOutputStream.write(strM9045qt.getBytes(C11341A5.f23802O));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file3.renameTo(file2);
                    fileOutputStream.close();
                } catch (Throwable unused) {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable unused2) {
                fileOutputStream = null;
            }
        } catch (IOException unused3) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m9088ri(C2518ri c2518ri, String str) {
        if (c2518ri == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(c2518ri.m9038ik())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return m9089ri(c2518ri.m9038ik(), str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m9089ri(String str, String str2) {
        String[] strArrSplit = str2.split("\\.");
        String[] strArrSplit2 = str.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            int length = strArrSplit[i].length() - strArrSplit2[i].length();
            if (length == 0) {
                int iCompareTo = strArrSplit[i].compareTo(strArrSplit2[i]);
                if (iCompareTo > 0) {
                    return true;
                }
                if (iCompareTo < 0) {
                    return false;
                }
                if (i == iMin - 1) {
                    return strArrSplit.length > strArrSplit2.length;
                }
            } else if (length > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m9090ri(List<C2518ri.ri> list, List<C2518ri.ri> list2) {
        for (C2518ri.ri riVar : list) {
            String strM9060ri = riVar.m9060ri();
            String strM10220ri = C2717fi.m10220ri(strM9060ri);
            File file = new File(mo9082ri(), strM10220ri);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            C2743ri c2743riMo9147di = C2531ri.m9163ri().m9166ik().mo9147di();
            c2743riMo9147di.m10365ik(strM9060ri);
            c2743riMo9147di.m10404ri(mo9082ri().getAbsolutePath(), strM10220ri);
            C2739lr c2739lrM10402ri = c2743riMo9147di.m10402ri();
            list2.add(riVar);
            if (c2739lrM10402ri == null || !c2739lrM10402ri.m10354di() || c2739lrM10402ri.m10355fi() == null || !c2739lrM10402ri.m10355fi().exists()) {
                m9092ik(list2);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m9091ri(Map<String, C2518ri> map, Map<String, C2518ri> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            C2518ri c2518ri = map.get(str);
            if (c2518ri == null) {
                return true;
            }
            C2518ri c2518ri2 = map2.get(str);
            if (c2518ri2 == null) {
                return false;
            }
            if (m9089ri(c2518ri.m9038ik(), c2518ri2.m9038ik())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ik */
    public void m9092ik(List<C2518ri.ri> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<C2518ri.ri> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(mo9082ri(), C2717fi.m10220ri(it.next().m9060ri()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    public List<C2518ri.ri> m9093lr(C2518ri c2518ri, C2518ri c2518ri2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (c2518ri2 == null || c2518ri2.m9036di().isEmpty()) {
            arrayList2.addAll(c2518ri.m9036di());
        } else if (c2518ri.m9036di().isEmpty()) {
            arrayList.addAll(c2518ri2.m9036di());
        } else {
            for (C2518ri.ri riVar : c2518ri.m9036di()) {
                if (!c2518ri2.m9036di().contains(riVar) && riVar != null && riVar.m9060ri() != null && riVar.m9058lr() != null) {
                    arrayList2.add(riVar);
                }
            }
            for (C2518ri.ri riVar2 : c2518ri2.m9036di()) {
                if (!c2518ri.m9036di().contains(riVar2)) {
                    arrayList.add(riVar2);
                }
            }
        }
        if (m9090ri(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: renamed from: lr */
    public void m9094lr(List<C2518ri.ri> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<C2518ri.ri> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(mo9082ri(), C2717fi.m10220ri(it.next().m9060ri()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public abstract File mo9082ri();

    /* JADX INFO: renamed from: ri */
    public List<C2518ri.ri> m9095ri(C2518ri c2518ri, C2518ri c2518ri2) {
        Map<String, C2518ri> mapM9046ri = c2518ri.m9046ri();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (mapM9046ri.size() == 0) {
            if (c2518ri2 != null && c2518ri2.m9046ri().size() != 0) {
                Map<String, C2518ri> mapM9046ri2 = c2518ri2.m9046ri();
                Iterator<String> it = mapM9046ri2.keySet().iterator();
                while (it.hasNext()) {
                    C2518ri c2518ri3 = mapM9046ri2.get(it.next());
                    if (c2518ri3 != null) {
                        arrayList.addAll(c2518ri3.m9036di());
                    }
                }
            }
        } else if (c2518ri2 != null && c2518ri2.m9046ri().size() != 0) {
            Map<String, C2518ri> mapM9046ri3 = c2518ri2.m9046ri();
            for (String str : mapM9046ri.keySet()) {
                C2518ri c2518ri4 = mapM9046ri.get(str);
                C2518ri c2518ri5 = mapM9046ri3.get(str);
                if (c2518ri5 == null && c2518ri4 != null) {
                    arrayList2.addAll(c2518ri4.m9036di());
                } else if (c2518ri4 == null && c2518ri5 != null) {
                    arrayList.addAll(c2518ri5.m9036di());
                } else if (c2518ri4 != null) {
                    for (C2518ri.ri riVar : c2518ri4.m9036di()) {
                        if (riVar != null && !c2518ri5.m9036di().contains(riVar) && riVar.m9058lr() != null && riVar.m9060ri() != null) {
                            arrayList2.add(riVar);
                        }
                    }
                    for (C2518ri.ri riVar2 : c2518ri5.m9036di()) {
                        if (riVar2 != null && !c2518ri4.m9036di().contains(riVar2)) {
                            arrayList.add(riVar2);
                        }
                    }
                }
            }
        } else if (mapM9046ri.size() != 0) {
            Iterator<String> it2 = mapM9046ri.keySet().iterator();
            while (it2.hasNext()) {
                C2518ri c2518ri6 = mapM9046ri.get(it2.next());
                if (c2518ri6 != null) {
                    arrayList2.addAll(c2518ri6.m9036di());
                }
            }
        }
        if (m9090ri(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public void m9096ri(int i) {
        if (C2531ri.m9163ri().m9167ka() != null) {
            C2531ri.m9163ri().m9167ka().mo9158ri(i);
        }
    }

    /* JADX INFO: renamed from: ri */
    protected boolean m9097ri(C2518ri.lr lrVar) {
        if (lrVar == null || mo9082ri() == null) {
            return false;
        }
        List<Pair<String, String>> listM9052lr = lrVar.m9052lr();
        if (listM9052lr == null || listM9052lr.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listM9052lr.iterator();
        while (it.hasNext()) {
            File file = new File(mo9082ri(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public boolean m9098ri(String str) {
        String strM10220ri = C2717fi.m10220ri(str);
        File file = new File(mo9082ri().getAbsoluteFile(), strM10220ri + ".zip");
        C2743ri c2743riMo9147di = C2531ri.m9163ri().m9166ik().mo9147di();
        c2743riMo9147di.m10365ik(str);
        c2743riMo9147di.m10404ri(file.getParent(), file.getName());
        C2739lr c2739lrM10402ri = c2743riMo9147di.m10402ri();
        if (c2739lrM10402ri.m10354di() && c2739lrM10402ri.m10355fi() != null && c2739lrM10402ri.m10355fi().exists()) {
            File fileM10355fi = c2739lrM10402ri.m10355fi();
            try {
                ory.m10265ri(fileM10355fi.getAbsolutePath(), file.getParent());
                if (!fileM10355fi.exists()) {
                    return true;
                }
                fileM10355fi.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ri */
    protected boolean m9099ri(List<C2518ri.ri> list) {
        if (list == null || list.size() <= 0 || mo9082ri() == null) {
            return false;
        }
        for (C2518ri.ri riVar : list) {
            String strM10220ri = C2717fi.m10220ri(riVar.m9060ri());
            if (TextUtils.isEmpty(strM10220ri)) {
                return false;
            }
            File file = new File(mo9082ri(), strM10220ri);
            String strM10219ri = C2717fi.m10219ri(file);
            if (!file.exists() || !file.isFile() || riVar.m9058lr() == null || !riVar.m9058lr().equals(strM10219ri)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    protected boolean m9100ri(Map<String, C2518ri> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            C2518ri c2518ri = map.get(it.next());
            if (c2518ri != null && !m9099ri(c2518ri.m9036di())) {
                return false;
            }
        }
        return true;
    }
}
