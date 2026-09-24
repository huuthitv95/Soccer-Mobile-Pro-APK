package com.applovin.impl;

import com.applovin.impl.sdk.C1768p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.applovin.impl.y2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1820y2 {

    /* JADX INFO: renamed from: a */
    private final C1671o4 f3630a = new C1671o4();

    /* JADX INFO: renamed from: b */
    private final TreeSet f3631b = new TreeSet();

    /* JADX INFO: renamed from: c */
    private final Map f3632c = new HashMap();

    /* JADX INFO: renamed from: d */
    private int f3633d;

    /* JADX INFO: renamed from: e */
    private int f3634e;

    public C1820y2(MaxAdPlacerSettings maxAdPlacerSettings) {
        m5676a(maxAdPlacerSettings);
    }

    /* JADX INFO: renamed from: a */
    private int m5674a(int i, boolean z) {
        int iM3744c = this.f3630a.m3744c(Integer.valueOf(i));
        if (!z) {
            int i2 = i + iM3744c;
            while (iM3744c < this.f3630a.size() && i2 >= ((Integer) this.f3630a.m3739a(iM3744c)).intValue()) {
                i2++;
                iM3744c++;
            }
        }
        return iM3744c;
    }

    /* JADX INFO: renamed from: a */
    private void m5675a(int i, int i2) {
        if (this.f3632c.containsKey(Integer.valueOf(i))) {
            this.f3632c.put(Integer.valueOf(i2), (MaxAd) this.f3632c.get(Integer.valueOf(i)));
            this.f3631b.add(Integer.valueOf(i2));
            this.f3632c.remove(Integer.valueOf(i));
            this.f3631b.remove(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5676a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            C1768p.m5167h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f3630a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f3630a.isEmpty()) {
            this.f3630a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f3630a.m3738a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f3630a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f3630a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public MaxAd m5677a(int i) {
        return (MaxAd) this.f3632c.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m5678a() {
        this.f3632c.clear();
        this.f3631b.clear();
    }

    /* JADX INFO: renamed from: a */
    public void m5679a(MaxAd maxAd, int i) {
        this.f3632c.put(Integer.valueOf(i), maxAd);
        this.f3631b.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m5680a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f3632c.remove(num);
            this.f3631b.remove(num);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m5681b(int i) {
        if (i == 0) {
            return 0;
        }
        return i + m5674a(i - 1, false);
    }

    /* JADX INFO: renamed from: b */
    public Collection m5682b() {
        return new TreeSet((SortedSet) this.f3631b);
    }

    /* JADX INFO: renamed from: b */
    public void m5683b(int i, int i2) {
        m5692i(i);
        m5689f(i2);
    }

    /* JADX INFO: renamed from: c */
    public int m5684c() {
        int i = this.f3633d;
        if (i != -1 && this.f3634e != -1) {
            while (i <= this.f3634e) {
                if (m5690g(i) && !m5691h(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public int m5685c(int i) {
        return i + m5674a(i, false);
    }

    /* JADX INFO: renamed from: c */
    public void m5686c(int i, int i2) {
        this.f3633d = i;
        this.f3634e = i2;
    }

    /* JADX INFO: renamed from: d */
    public int m5687d(int i) {
        if (m5690g(i)) {
            return -1;
        }
        return i - m5674a(i, true);
    }

    /* JADX INFO: renamed from: e */
    public Collection m5688e(int i) {
        return new TreeSet((SortedSet) this.f3631b.tailSet(Integer.valueOf(i), false));
    }

    /* JADX INFO: renamed from: f */
    public void m5689f(int i) {
        int iM3742b = this.f3630a.m3742b(Integer.valueOf(i));
        for (int size = this.f3630a.size() - 1; size >= iM3742b; size--) {
            Integer num = (Integer) this.f3630a.m3739a(size);
            int iIntValue = num.intValue() + 1;
            m5675a(num.intValue(), iIntValue);
            this.f3630a.m3740a(size, Integer.valueOf(iIntValue));
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m5690g(int i) {
        return this.f3630a.contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public boolean m5691h(int i) {
        return this.f3631b.contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public void m5692i(int i) {
        int iM3742b = this.f3630a.m3742b(Integer.valueOf(i));
        if (m5690g(i)) {
            this.f3632c.remove(Integer.valueOf(i));
            this.f3631b.remove(Integer.valueOf(i));
            this.f3630a.m3743b(iM3742b);
        }
        while (iM3742b < this.f3630a.size()) {
            Integer num = (Integer) this.f3630a.m3739a(iM3742b);
            int iIntValue = num.intValue() - 1;
            m5675a(num.intValue(), iIntValue);
            this.f3630a.m3740a(iM3742b, Integer.valueOf(iIntValue));
            iM3742b++;
        }
    }
}
