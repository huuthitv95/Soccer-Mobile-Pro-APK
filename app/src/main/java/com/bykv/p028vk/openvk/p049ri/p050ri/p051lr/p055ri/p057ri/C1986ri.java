package com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p057ri;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.C1979ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p053ka.C1976lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.C1983ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p056lr.C1980ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p051lr.p055ri.p056lr.C1981lr;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1996ik;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.C2006ri;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.bykv.vk.openvk.ri.ri.lr.ri.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C1986ri implements InterfaceC2005lr {

    /* JADX INFO: renamed from: ri */
    private String f4597ri = "video_reward_full";

    /* JADX INFO: renamed from: lr */
    private String f4595lr = "video_brand";

    /* JADX INFO: renamed from: ik */
    private String f4593ik = "video_splash";

    /* JADX INFO: renamed from: ka */
    private String f4594ka = "video_default";

    /* JADX INFO: renamed from: fi */
    private String f4592fi = null;

    /* JADX INFO: renamed from: di */
    private String f4591di = null;
    private String xha = null;

    /* JADX INFO: renamed from: mj */
    private String f4596mj = null;
    private String jbs = null;

    /* JADX INFO: renamed from: di */
    private List<C2006ri> m6267di() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2006ri(new File(mo6274ri()).listFiles(), C1979ri.m6213ik()));
        arrayList.add(new C2006ri(new File(mo6273lr()).listFiles(), C1979ri.m6215lr()));
        arrayList.add(new C2006ri(new File(m6269fi()).listFiles(), C1979ri.m6214ka()));
        arrayList.add(new C2006ri(new File(mo6270ik()).listFiles(), C1979ri.m6212fi()));
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    private static void m6268ri(File[] fileArr, int i, Set<String> set) {
        if (i >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.ri.ri.lr.ri.ri.ri.1
                        @Override // java.util.Comparator
                        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i < listAsList.size()) {
                        File file = (File) listAsList.get(i);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i)).delete();
                        }
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private Set<String> xha() {
        HashSet hashSet = new HashSet();
        for (C1983ri c1983ri : C1983ri.f4574ri.values()) {
            if (c1983ri != null && c1983ri.m6247ri() != null) {
                C1996ik c1996ikM6247ri = c1983ri.m6247ri();
                hashSet.add(C1976lr.m6204lr(c1996ikM6247ri.m6307fi(), c1996ikM6247ri.m6302bu()).getAbsolutePath());
                hashSet.add(C1976lr.m6203ik(c1996ikM6247ri.m6307fi(), c1996ikM6247ri.m6302bu()).getAbsolutePath());
            }
        }
        for (C1981lr c1981lr : C1980ik.f4565ri.values()) {
            if (c1981lr != null && c1981lr.m6240ri() != null) {
                C1996ik c1996ikM6240ri = c1981lr.m6240ri();
                hashSet.add(C1976lr.m6204lr(c1996ikM6240ri.m6307fi(), c1996ikM6240ri.m6302bu()).getAbsolutePath());
                hashSet.add(C1976lr.m6203ik(c1996ikM6240ri.m6307fi(), c1996ikM6240ri.m6302bu()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: fi */
    public String m6269fi() {
        if (this.xha == null) {
            this.xha = this.f4592fi + File.separator + this.f4595lr;
            File file = new File(this.xha);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.xha;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr
    /* JADX INFO: renamed from: ik */
    public String mo6270ik() {
        if (this.jbs == null) {
            this.jbs = this.f4592fi + File.separator + this.f4594ka;
            File file = new File(this.jbs);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.jbs;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr
    /* JADX INFO: renamed from: ka */
    public synchronized void mo6271ka() {
        Set<String> setXha = null;
        for (C2006ri c2006ri : m6267di()) {
            File[] fileArrM6436ri = c2006ri.m6436ri();
            if (fileArrM6436ri != null && fileArrM6436ri.length >= c2006ri.m6435lr()) {
                if (setXha == null) {
                    setXha = xha();
                }
                int iM6435lr = c2006ri.m6435lr() - 2;
                if (iM6435lr < 0) {
                    iM6435lr = 0;
                }
                m6268ri(c2006ri.m6436ri(), iM6435lr, setXha);
            }
        }
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr
    /* JADX INFO: renamed from: lr */
    public long mo6272lr(C1996ik c1996ik) {
        if (TextUtils.isEmpty(c1996ik.m6307fi()) || TextUtils.isEmpty(c1996ik.m6302bu())) {
            return 0L;
        }
        return C1976lr.m6205ri(c1996ik.m6307fi(), c1996ik.m6302bu());
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr
    /* JADX INFO: renamed from: lr */
    public String mo6273lr() {
        if (this.f4596mj == null) {
            this.f4596mj = this.f4592fi + File.separator + this.f4593ik;
            File file = new File(this.f4596mj);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f4596mj;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr
    /* JADX INFO: renamed from: ri */
    public String mo6274ri() {
        if (this.f4591di == null) {
            this.f4591di = this.f4592fi + File.separator + this.f4597ri;
            File file = new File(this.f4591di);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.f4591di;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr
    /* JADX INFO: renamed from: ri */
    public void mo6275ri(String str) {
        this.f4592fi = str;
    }

    @Override // com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p064ri.InterfaceC2005lr
    /* JADX INFO: renamed from: ri */
    public boolean mo6276ri(C1996ik c1996ik) {
        if (TextUtils.isEmpty(c1996ik.m6307fi()) || TextUtils.isEmpty(c1996ik.m6302bu())) {
            return false;
        }
        return new File(c1996ik.m6307fi(), c1996ik.m6302bu()).exists();
    }
}
