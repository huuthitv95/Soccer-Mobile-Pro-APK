package com.bytedance.sdk.openadsdk.p244lr;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3472lr extends AbstractC3473ri {

    /* JADX INFO: renamed from: ik */
    private int f12543ik;

    /* JADX INFO: renamed from: ka */
    private volatile boolean f12544ka;

    /* JADX INFO: renamed from: lr */
    private int f12545lr;

    public C3472lr(int i, int i2) {
        this.f12545lr = 15;
        this.f12543ik = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f12545lr = i;
        this.f12543ik = i2;
    }

    public C3472lr(int i, int i2, boolean z) {
        this.f12545lr = 15;
        this.f12543ik = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.f12545lr = i;
        this.f12543ik = i2;
        this.f12544ka = z;
    }

    /* JADX INFO: renamed from: ik */
    private void m15726ik(List<File> list) {
        long jLr = m15732lr(list);
        int size = list.size();
        if (mo15728ri(jLr, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jLr -= length;
            }
            if (mo15729ri(file, jLr, size)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ka */
    private void m15727ka(List<File> list) {
        long jLr;
        int size;
        boolean zMo15728ri;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zMo15728ri = mo15728ri((jLr = m15732lr(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zMo15728ri) {
                            ((Long) entry.getKey()).longValue();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jLr -= length;
                            }
                            if (mo15729ri(file2, jLr, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p244lr.AbstractC3473ri
    /* JADX INFO: renamed from: ri */
    protected void mo12657ri(List<File> list) {
        if (!this.f12544ka) {
            m15726ik(list);
        } else {
            m15727ka(list);
            this.f12544ka = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.p244lr.AbstractC3473ri
    /* JADX INFO: renamed from: ri */
    protected boolean mo15728ri(long j, int i) {
        return i <= this.f12545lr;
    }

    @Override // com.bytedance.sdk.openadsdk.p244lr.AbstractC3473ri
    /* JADX INFO: renamed from: ri */
    protected boolean mo15729ri(File file, long j, int i) {
        return i <= this.f12543ik;
    }
}
