package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinBroadcastManager {

    /* JADX INFO: renamed from: a */
    private static final Map f2820a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static final Map f2821b = new HashMap();

    /* JADX INFO: renamed from: c */
    private static final ArrayList f2822c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private static final Handler f2823d = new HandlerC1725a(Looper.getMainLooper());

    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$a */
    class HandlerC1725a extends Handler {
        HandlerC1725a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.m4390b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$b */
    private static class C1726b {

        /* JADX INFO: renamed from: a */
        final Intent f2824a;

        /* JADX INFO: renamed from: b */
        final Map f2825b;

        /* JADX INFO: renamed from: c */
        final List f2826c;

        C1726b(Intent intent, Map map, List list) {
            this.f2824a = intent;
            this.f2825b = map;
            this.f2826c = list;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$c */
    private static class C1727c {

        /* JADX INFO: renamed from: a */
        final IntentFilter f2827a;

        /* JADX INFO: renamed from: b */
        final Receiver f2828b;

        /* JADX INFO: renamed from: c */
        boolean f2829c;

        /* JADX INFO: renamed from: d */
        boolean f2830d;

        C1727c(IntentFilter intentFilter, Receiver receiver) {
            this.f2827a = intentFilter;
            this.f2828b = receiver;
        }
    }

    /* JADX INFO: renamed from: a */
    private static List m4388a(Intent intent) {
        synchronized (f2820a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<C1727c> list = (List) f2821b.get(action);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = null;
            for (C1727c c1727c : list) {
                if (!c1727c.f2829c && c1727c.f2827a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c1727c);
                    c1727c.f2829c = true;
                }
            }
            if (arrayList == null) {
                return null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C1727c) it.next()).f2829c = false;
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m4390b() {
        int size;
        C1726b[] c1726bArr;
        while (true) {
            synchronized (f2820a) {
                ArrayList arrayList = f2822c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                c1726bArr = new C1726b[size];
                arrayList.toArray(c1726bArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                C1726b c1726b = c1726bArr[i];
                if (c1726b != null) {
                    for (C1727c c1727c : c1726b.f2826c) {
                        if (c1727c != null && !c1727c.f2830d) {
                            c1727c.f2828b.onReceive(c1726b.f2824a, c1726b.f2825b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f2820a;
        synchronized (map) {
            C1727c c1727c = new C1727c(intentFilter, receiver);
            ArrayList arrayList = (ArrayList) map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(c1727c);
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            while (itActionsIterator.hasNext()) {
                String next = itActionsIterator.next();
                Map map2 = f2821b;
                ArrayList arrayList2 = (ArrayList) map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(c1727c);
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f2820a) {
            List listM4388a = m4388a(intent);
            if (listM4388a == null) {
                return false;
            }
            f2822c.add(new C1726b(intent, map, listM4388a));
            Handler handler = f2823d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<C1727c> listM4388a = m4388a(intent);
        if (listM4388a == null) {
            return;
        }
        for (C1727c c1727c : listM4388a) {
            if (!c1727c.f2830d) {
                c1727c.f2828b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            m4390b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap map = new HashMap(1);
        map.put("ad", obj);
        return sendBroadcast(new Intent(str), map);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f2820a;
        synchronized (map) {
            List<C1727c> list = (List) map.remove(receiver);
            if (list == null) {
                return;
            }
            for (C1727c c1727c : list) {
                c1727c.f2830d = true;
                Iterator<String> itActionsIterator = c1727c.f2827a.actionsIterator();
                while (itActionsIterator.hasNext()) {
                    String next = itActionsIterator.next();
                    List list2 = (List) f2821b.get(next);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((C1727c) it.next()).f2828b == receiver) {
                                c1727c.f2830d = true;
                                it.remove();
                            }
                        }
                        if (list2.size() <= 0) {
                            f2821b.remove(next);
                        }
                    }
                }
            }
        }
    }
}
