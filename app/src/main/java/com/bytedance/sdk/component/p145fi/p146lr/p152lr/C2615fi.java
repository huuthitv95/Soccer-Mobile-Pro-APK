package com.bytedance.sdk.component.p145fi.p146lr.p152lr;

import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2600ik;
import com.bytedance.sdk.component.p145fi.p146lr.p147ik.C2605ri;
import com.bytedance.sdk.component.p145fi.tan;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2615fi implements InterfaceC2614di {
    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public String mo9721ri() {
        return "check_duplicate";
    }

    @Override // com.bytedance.sdk.component.p145fi.p146lr.p152lr.InterfaceC2614di
    /* JADX INFO: renamed from: ri */
    public boolean mo9722ri(C2600ik c2600ik, tan tanVar, C2605ri c2605ri) {
        List<C2600ik> copyOnWriteArrayList;
        String strTan = c2600ik.tan();
        Map<String, List<C2600ik>> mapJbs = c2600ik.slm().jbs();
        c2600ik.m9633sf();
        c2600ik.mo9571ri();
        synchronized (mapJbs) {
            copyOnWriteArrayList = mapJbs.get(strTan);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                mapJbs.put(strTan, copyOnWriteArrayList);
            }
        }
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(c2600ik);
            if (copyOnWriteArrayList.size() <= 1) {
                return true;
            }
            c2600ik.m9633sf();
            c2600ik.mo9571ri();
            return false;
        }
    }
}
