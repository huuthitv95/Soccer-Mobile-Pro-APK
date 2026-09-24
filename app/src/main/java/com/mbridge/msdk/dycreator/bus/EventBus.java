package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public final class EventBus {

    /* JADX INFO: renamed from: o */
    private static volatile EventBus f35236o;

    /* JADX INFO: renamed from: k */
    private boolean f35248k;

    /* JADX INFO: renamed from: n */
    static ExecutorService f35235n = Executors.newCachedThreadPool();
    public static String TAG = "Event";

    /* JADX INFO: renamed from: p */
    private static final Map<Class<?>, List<Class<?>>> f35237p = new HashMap();

    /* JADX INFO: renamed from: a */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f35238a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<Object, List<Class<?>>> f35239b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Map<Class<?>, Object> f35240c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    private final ThreadLocal<List<Object>> f35241d = new ThreadLocal<List<Object>>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<Object> initialValue() {
            return new ArrayList();
        }
    };

    /* JADX INFO: renamed from: e */
    private final ThreadLocal<BooleanWrapper> f35242e = new ThreadLocal<BooleanWrapper>() { // from class: com.mbridge.msdk.dycreator.bus.EventBus.2
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BooleanWrapper initialValue() {
            return new BooleanWrapper();
        }
    };

    /* JADX INFO: renamed from: f */
    private String f35243f = "onEvent";

    /* JADX INFO: renamed from: g */
    private final HandlerPoster f35244g = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* JADX INFO: renamed from: h */
    private final BackgroundPoster f35245h = new BackgroundPoster(this);

    /* JADX INFO: renamed from: i */
    private final AsyncPoster f35246i = new AsyncPoster(this);

    /* JADX INFO: renamed from: j */
    private final SubscriberMethodFinder f35247j = new SubscriberMethodFinder();

    /* JADX INFO: renamed from: l */
    private boolean f35249l = true;

    /* JADX INFO: renamed from: m */
    private Map<String, Object> f35250m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3 */
    static /* synthetic */ class C129703 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f35253a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f35253a = iArr;
            try {
                iArr[ThreadMode.PostThread.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35253a[ThreadMode.MainThread.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35253a[ThreadMode.BackgroundThread.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35253a[ThreadMode.Async.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class BooleanWrapper {

        /* JADX INFO: renamed from: a */
        boolean f35254a;

        BooleanWrapper() {
        }
    }

    interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    /* JADX INFO: renamed from: a */
    private void m36331a(Object obj, String str, boolean z) {
        Iterator<SubscriberMethod> it = this.f35247j.m36348a(obj.getClass(), str).iterator();
        while (it.hasNext()) {
            m36329a(obj, it.next(), z);
        }
    }

    public static void clearCaches() {
        SubscriberMethodFinder.m36346a();
        f35237p.clear();
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public static EventBus getDefault() {
        if (f35236o == null) {
            synchronized (EventBus.class) {
                if (f35236o == null) {
                    f35236o = new EventBus();
                }
            }
        }
        return f35236o;
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.m36347a(cls);
    }

    public void configureLogSubscriberExceptions(boolean z) {
        if (this.f35248k) {
            throw new EventBusException("This method must be called before any registration");
        }
        this.f35249l = z;
    }

    public Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f35240c) {
            obj = this.f35240c.get(cls);
        }
        return obj;
    }

    public void post(Object obj) {
        List<Object> list = this.f35241d.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f35242e.get();
        if (booleanWrapper.f35254a) {
            return;
        }
        boolean z = Looper.getMainLooper() == Looper.myLooper();
        booleanWrapper.f35254a = true;
        while (!list.isEmpty()) {
            try {
                m36333a(list.remove(0), z);
            } catch (Throwable th) {
                booleanWrapper.f35254a = false;
                throw th;
            }
        }
        booleanWrapper.f35254a = false;
    }

    public void postSticky(Object obj) {
        post(obj);
        synchronized (this.f35240c) {
            this.f35240c.put(obj.getClass(), obj);
        }
    }

    public void register(Object obj) {
        m36331a(obj, this.f35243f, false);
    }

    public void registerSticky(Object obj) {
        m36331a(obj, this.f35243f, true);
    }

    public void release() {
        if (f35236o != null) {
            f35236o = null;
            f35235n = null;
            Map<Class<?>, List<Class<?>>> map = f35237p;
            if (map != null && map.size() > 0) {
                map.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f35238a;
            if (map2 != null && map2.size() > 0) {
                this.f35238a.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f35239b;
            if (map3 != null && map3.size() > 0) {
                this.f35239b.clear();
            }
            Map<Class<?>, Object> map4 = this.f35240c;
            if (map4 != null && map4.size() > 0) {
                this.f35240c.clear();
            }
            Map<String, Object> map5 = this.f35250m;
            if (map5 == null || map5.size() <= 0) {
                return;
            }
            this.f35250m.clear();
        }
    }

    public Object removeStickyEvent(Class<?> cls) {
        Object objRemove;
        synchronized (this.f35240c) {
            objRemove = this.f35240c.remove(cls);
        }
        return objRemove;
    }

    public synchronized void unregister(Object obj, Class<?>... clsArr) {
        if (clsArr.length == 0) {
            throw new IllegalArgumentException("Provide at least one event class");
        }
        List<Class<?>> list = this.f35239b.get(obj);
        if (list != null) {
            for (Class<?> cls : clsArr) {
                m36330a(obj, cls);
                list.remove(cls);
            }
            if (list.isEmpty()) {
                this.f35239b.remove(obj);
            }
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public void register(String str, Object obj) {
        Map<String, Object> map = this.f35250m;
        if (map != null && map.containsKey(str)) {
            unregister(this.f35250m.get(str));
        }
        this.f35250m.put(str, obj);
        m36331a(obj, this.f35243f, false);
    }

    public void registerSticky(Object obj, String str) {
        m36331a(obj, str, true);
    }

    public void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        m36332a(obj, this.f35243f, true, cls, clsArr);
    }

    public synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        m36332a(obj, str, true, cls, clsArr);
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.f35240c) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.f35240c.get(cls))) {
                return false;
            }
            this.f35240c.remove(cls);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m36332a(Object obj, String str, boolean z, Class<?> cls, Class<?>... clsArr) {
        for (SubscriberMethod subscriberMethod : this.f35247j.m36348a(obj.getClass(), str)) {
            if (cls == subscriberMethod.f35267c) {
                m36329a(obj, subscriberMethod, z);
            } else if (clsArr != null) {
                for (Class<?> cls2 : clsArr) {
                    if (cls2 == subscriberMethod.f35267c) {
                        m36329a(obj, subscriberMethod, z);
                        break;
                    }
                }
            }
        }
    }

    public void register(Object obj, String str) {
        m36331a(obj, str, false);
    }

    public void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        m36332a(obj, this.f35243f, false, cls, clsArr);
    }

    public synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        m36332a(obj, str, false, cls, clsArr);
    }

    public synchronized void unregister(Object obj) {
        List<Class<?>> list = this.f35239b.get(obj);
        if (list != null) {
            Iterator<Class<?>> it = list.iterator();
            while (it.hasNext()) {
                m36330a(obj, it.next());
            }
            this.f35239b.remove(obj);
        } else {
            Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36329a(Object obj, SubscriberMethod subscriberMethod, boolean z) {
        Object obj2;
        this.f35248k = true;
        Class<?> cls = subscriberMethod.f35267c;
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f35238a.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.f35238a.put(cls, copyOnWriteArrayList);
        } else {
            Iterator<Subscription> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (it.next().equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f35265a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List<Class<?>> arrayList = this.f35239b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f35239b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (z) {
            synchronized (this.f35240c) {
                obj2 = this.f35240c.get(cls);
            }
            if (obj2 != null) {
                m36328a(subscription, obj2, Looper.getMainLooper() == Looper.myLooper());
            }
        }
    }

    public synchronized void unregister(String str) {
        Map<String, Object> map = this.f35250m;
        if (map != null && map.containsKey(str)) {
            Object objRemove = this.f35250m.remove(str);
            List<Class<?>> list = this.f35239b.get(objRemove);
            if (list != null) {
                Iterator<Class<?>> it = list.iterator();
                while (it.hasNext()) {
                    m36330a(objRemove, it.next());
                }
                this.f35239b.remove(objRemove);
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + objRemove.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36330a(Object obj, Class<?> cls) {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList = this.f35238a.get(cls);
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            int i = 0;
            while (i < size) {
                if (copyOnWriteArrayList.get(i).f35271a == obj) {
                    copyOnWriteArrayList.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36333a(Object obj, boolean z) throws Error {
        CopyOnWriteArrayList<Subscription> copyOnWriteArrayList;
        if (obj != null) {
            try {
                Class<?> cls = obj.getClass();
                List<Class<?>> listM36327a = m36327a(cls);
                int size = listM36327a.size();
                boolean z2 = false;
                for (int i = 0; i < size; i++) {
                    Class<?> cls2 = listM36327a.get(i);
                    synchronized (this) {
                        copyOnWriteArrayList = this.f35238a.get(cls2);
                    }
                    if (copyOnWriteArrayList != null) {
                        Iterator<Subscription> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            m36328a(it.next(), obj, z);
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    return;
                }
                Log.d(TAG, "No subscripers registered for event " + cls);
                if (cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class) {
                    return;
                }
                post(new NoSubscriberEvent(this, obj));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m36328a(Subscription subscription, Object obj, boolean z) {
        int i = C129703.f35253a[subscription.f35272b.f35266b.ordinal()];
        if (i == 1) {
            m36336a(subscription, obj);
            return;
        }
        if (i == 2) {
            if (z) {
                m36336a(subscription, obj);
                return;
            } else {
                this.f35244g.m36339a(subscription, obj);
                return;
            }
        }
        if (i == 3) {
            if (z) {
                this.f35245h.enqueue(subscription, obj);
                return;
            } else {
                m36336a(subscription, obj);
                return;
            }
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown thread mode: " + subscription.f35272b.f35266b);
        }
        this.f35246i.enqueue(subscription, obj);
    }

    /* JADX INFO: renamed from: a */
    private List<Class<?>> m36327a(Class<?> cls) {
        List<Class<?>> arrayList;
        Map<Class<?>, List<Class<?>>> map = f35237p;
        synchronized (map) {
            arrayList = map.get(cls);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                for (Class<?> superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                    arrayList.add(superclass);
                    m36334a(arrayList, superclass.getInterfaces());
                }
                f35237p.put(cls, arrayList);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    static void m36334a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m36334a(list, cls.getInterfaces());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m36335a(PendingPost pendingPost) {
        Object obj = pendingPost.f35260a;
        Subscription subscription = pendingPost.f35261b;
        PendingPost.m36341a(pendingPost);
        m36336a(subscription, obj);
    }

    /* JADX INFO: renamed from: a */
    void m36336a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.f35272b.f35265a.invoke(subscription.f35271a, obj);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unexpected exception", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                Log.e(TAG, "SubscriberExceptionEvent subscriber " + subscription.f35271a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Log.e(TAG, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f35249l) {
                Log.e(TAG, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f35271a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f35271a));
        }
    }
}
