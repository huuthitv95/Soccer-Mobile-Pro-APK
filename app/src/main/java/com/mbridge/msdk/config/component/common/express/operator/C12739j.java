package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.common.express.operator.parts.C12746a;
import com.mbridge.msdk.config.component.common.express.operator.parts.CallableC12747b;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.j */
/* JADX INFO: compiled from: OperatorHighLevelMethod.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12739j {

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.express.operator.j$a */
    /* JADX INFO: compiled from: OperatorHighLevelMethod.java */
    class a implements Comparator<Object> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ CallableC12747b f33896a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f33897b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f33898c;

        a(CallableC12747b callableC12747b, int i, boolean z) {
            this.f33896a = callableC12747b;
            this.f33897b = i;
            this.f33898c = z;
        }

        /* JADX WARN: Code duplicated, block: B:67:0x0104  */
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int iCompareTo;
            boolean z = false;
            if (obj == null || obj2 == null) {
                return 0;
            }
            try {
                this.f33896a.m35020a(obj);
                FutureTask futureTask = new FutureTask(this.f33896a);
                new Thread(futureTask).start();
                Object obj3 = futureTask.get();
                this.f33896a.m35020a(obj2);
                FutureTask futureTask2 = new FutureTask(this.f33896a);
                new Thread(futureTask2).start();
                Object obj4 = futureTask2.get();
                int i = this.f33897b;
                if (i == 0) {
                    if ((obj3 instanceof Number) && (obj4 instanceof Number)) {
                        iCompareTo = Double.valueOf(obj3.toString()).compareTo(Double.valueOf(obj4.toString()));
                    } else {
                        iCompareTo = 0;
                    }
                } else if (i == 1) {
                    if ((obj3 instanceof String) && (obj4 instanceof String)) {
                        iCompareTo = ((String) obj3).compareTo((String) obj4);
                    } else {
                        iCompareTo = 0;
                    }
                } else if (i == 2) {
                    if ((obj3 instanceof Number) && (obj4 instanceof String)) {
                        iCompareTo = -1;
                        z = true;
                    } else if ((obj3 instanceof String) && (obj4 instanceof Number)) {
                        iCompareTo = 1;
                        z = true;
                    } else if ((obj3 instanceof Number) && (obj4 instanceof Number)) {
                        iCompareTo = Double.valueOf(obj3.toString()).compareTo(Double.valueOf(obj4.toString()));
                    } else if ((obj3 instanceof String) && (obj4 instanceof String)) {
                        iCompareTo = ((String) obj3).compareTo((String) obj4);
                    } else {
                        iCompareTo = 0;
                    }
                } else if (i != 3) {
                    iCompareTo = 0;
                } else if ((obj3 instanceof Number) && (obj4 instanceof String)) {
                    iCompareTo = 1;
                    z = true;
                } else if ((obj3 instanceof String) && (obj4 instanceof Number)) {
                    iCompareTo = -1;
                    z = true;
                } else if ((obj3 instanceof Number) && (obj4 instanceof Number)) {
                    iCompareTo = Double.valueOf(obj3.toString()).compareTo(Double.valueOf(obj4.toString()));
                } else if ((obj3 instanceof String) && (obj4 instanceof String)) {
                    iCompareTo = ((String) obj3).compareTo((String) obj4);
                } else {
                    iCompareTo = 0;
                }
            } catch (Exception e) {
                C13219q0.m37817b("SQLOperator", e.getMessage(), e);
            }
            return (this.f33898c || z) ? iCompareTo : -iCompareTo;
        }
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34967a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return C12746a.m35017c();
        }
        try {
            if (str.equals(C12770c.m35209b("876"))) {
                return m34969b(obj, list);
            }
            if (str.equals(C12770c.m35209b("877"))) {
                return m34966a(obj, list);
            }
            return str.equals(C12770c.m35209b("878")) ? m34970c(obj, list) : C12746a.m35016a(null);
        } catch (Exception e) {
            C13219q0.m37817b("SQLOperator", e.getMessage(), e);
            return C12746a.m35016a(null);
        }
    }

    /* JADX INFO: renamed from: c */
    private C12746a m34970c(Object obj, List<Object> list) {
        if (!(obj instanceof ArrayList)) {
            return C12746a.m35017c();
        }
        if (list == null || list.isEmpty()) {
            return C12746a.m35016a(null);
        }
        Object obj2 = list.get(0);
        if (!(obj2 instanceof CallableC12747b)) {
            return C12746a.m35016a(null);
        }
        boolean z = true;
        if (list.size() > 1 && Integer.parseInt(list.get(1).toString()) != 1) {
            z = false;
        }
        int i = list.size() > 2 ? Integer.parseInt(list.get(2).toString()) : 0;
        ArrayList arrayList = new ArrayList((ArrayList) obj);
        Collections.sort(arrayList, new a((CallableC12747b) obj2, i, z));
        return C12746a.m35016a(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public C12746a m34971b(String str, Object obj, List<Object> list) {
        return m34968a(str) ? m34967a(str, obj, list) : C12746a.m35017c();
    }

    /* JADX INFO: renamed from: b */
    private C12746a m34969b(Object obj, List<Object> list) {
        boolean z = obj instanceof ArrayList;
        if (!z && !(obj instanceof HashMap) && !(obj instanceof C12894a)) {
            return C12746a.m35016a(null);
        }
        if (list != null && !list.isEmpty()) {
            Object obj2 = list.get(0);
            if (!(obj2 instanceof CallableC12747b)) {
                return C12746a.m35016a(null);
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                ArrayList arrayList2 = (ArrayList) obj;
                CallableC12747b callableC12747b = (CallableC12747b) obj2;
                for (int i = 0; i < arrayList2.size(); i++) {
                    callableC12747b.m35020a(arrayList2.get(i));
                    FutureTask futureTask = new FutureTask(callableC12747b);
                    new Thread(futureTask).start();
                    try {
                        if (futureTask.get() != null) {
                            arrayList.add(futureTask.get());
                        }
                    } catch (Exception e) {
                        C13219q0.m37817b("SQLOperator", e.getMessage(), e);
                    }
                }
            } else if (obj instanceof C12894a) {
                CallableC12747b callableC12747b2 = (CallableC12747b) obj2;
                for (Map.Entry<String, Object> entry : ((C12894a) obj).m36047a()) {
                    C12894a c12894a = new C12894a();
                    c12894a.m36045a("key", entry.getKey());
                    c12894a.m36045a("value", entry.getValue());
                    callableC12747b2.m35020a(c12894a);
                    FutureTask futureTask2 = new FutureTask(callableC12747b2);
                    new Thread(futureTask2).start();
                    try {
                        if (futureTask2.get() != null) {
                            arrayList.add(futureTask2.get());
                        }
                    } catch (Exception e2) {
                        C13219q0.m37817b("SQLOperator", e2.getMessage(), e2);
                    }
                }
            }
            return C12746a.m35016a(arrayList);
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: a */
    private C12746a m34966a(Object obj, List<Object> list) {
        boolean z = obj instanceof ArrayList;
        if (!z && !(obj instanceof HashMap) && !(obj instanceof C12894a)) {
            return C12746a.m35017c();
        }
        if (list != null && !list.isEmpty()) {
            Object obj2 = list.get(0);
            if (!(obj2 instanceof CallableC12747b)) {
                return C12746a.m35016a(null);
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                ArrayList arrayList2 = (ArrayList) obj;
                CallableC12747b callableC12747b = (CallableC12747b) obj2;
                for (int i = 0; i < arrayList2.size(); i++) {
                    Object obj3 = arrayList2.get(i);
                    callableC12747b.m35020a(obj3);
                    FutureTask futureTask = new FutureTask(callableC12747b);
                    new Thread(futureTask).start();
                    try {
                        if (futureTask.get() != null && Integer.parseInt(futureTask.get().toString()) == 1) {
                            arrayList.add(obj3);
                        }
                    } catch (Exception e) {
                        C13219q0.m37817b("SQLOperator", e.getMessage(), e);
                    }
                }
            } else {
                if (obj instanceof HashMap) {
                    HashMap map = new HashMap();
                    CallableC12747b callableC12747b2 = (CallableC12747b) obj2;
                    for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                        HashMap map2 = new HashMap();
                        map2.put("key", entry.getKey());
                        map2.put("value", entry.getValue());
                        callableC12747b2.m35020a(map2);
                        FutureTask futureTask2 = new FutureTask(callableC12747b2);
                        new Thread(futureTask2).start();
                        try {
                            if (Integer.parseInt(futureTask2.get().toString()) == 1) {
                                arrayList.add(map2);
                                map.put(entry.getKey(), entry.getValue());
                            }
                        } catch (Exception e2) {
                            C13219q0.m37817b("SQLOperator", e2.getMessage(), e2);
                        }
                    }
                    return C12746a.m35016a(map);
                }
                if (obj instanceof C12894a) {
                    C12894a c12894a = new C12894a();
                    CallableC12747b callableC12747b3 = (CallableC12747b) obj2;
                    for (Map.Entry<String, Object> entry2 : ((C12894a) obj).m36047a()) {
                        HashMap map3 = new HashMap();
                        map3.put("key", entry2.getKey());
                        map3.put("value", entry2.getValue());
                        callableC12747b3.m35020a(map3);
                        FutureTask futureTask3 = new FutureTask(callableC12747b3);
                        new Thread(futureTask3).start();
                        try {
                            if (Integer.parseInt(futureTask3.get().toString()) == 1) {
                                arrayList.add(map3);
                                c12894a.m36045a(entry2.getKey(), entry2.getValue());
                            }
                        } catch (Exception e3) {
                            C13219q0.m37817b("SQLOperator", e3.getMessage(), e3);
                        }
                    }
                    return C12746a.m35016a(c12894a);
                }
            }
            return C12746a.m35016a(arrayList);
        }
        return C12746a.m35016a(null);
    }

    /* JADX INFO: renamed from: a */
    private boolean m34968a(String str) {
        return str.equals(C12770c.m35209b("876")) || str.equals(C12770c.m35209b("877")) || str.equals(C12770c.m35209b("878"));
    }
}
