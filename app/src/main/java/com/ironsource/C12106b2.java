package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.b2 */
/* JADX INFO: loaded from: classes6.dex */
public class C12106b2 {

    /* JADX INFO: renamed from: c */
    public static final int f30069c = -1;

    /* JADX INFO: renamed from: d */
    public static final int f30070d = 0;

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, ArrayList<a>> f30071a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private int f30072b;

    /* JADX INFO: renamed from: com.ironsource.b2$a */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C12106b2(List<NetworkSettings> list, int i) {
        this.f30072b = i;
        for (NetworkSettings networkSettings : list) {
            this.f30071a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m31127a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f30072b == 0) {
            return;
        }
        for (String str : this.f30071a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f30071a.get(str);
            if (this.f30072b != -1 && arrayList.size() == this.f30072b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public String mo27405a(String str) {
        ArrayList<a> arrayList = this.f30071a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            str2 = "" + it.next().ordinal();
            while (it.hasNext()) {
                str2 = (str2 + ",") + it.next().ordinal();
            }
        }
        return str2;
    }
}
