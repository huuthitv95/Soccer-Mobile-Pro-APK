package com.facebook.internal.logging.dumpsys;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: AndroidRootResolver.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\nH\u0002J\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m43475d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver;", "", "()V", "initialized", "", "paramsField", "Ljava/lang/reflect/Field;", "viewsField", "windowManagerObj", "attachActiveRootListener", "", "listener", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", MobileAdsBridgeBase.initializeMethodName, "listActiveRoots", "", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Root;", "Companion", "ListenableArrayList", "Listener", "Root", "facebook-core_release"}, m43476k = 1, m43477mv = {1, 5, 1})
public final class AndroidRootResolver {
    private static final String GET_DEFAULT_IMPL = "getDefault";
    private static final String GET_GLOBAL_INSTANCE = "getInstance";
    private static final String TAG;
    private static final String VIEWS_FIELD = "mViews";
    private static final String WINDOW_MANAGER_GLOBAL_CLAZZ = "android.view.WindowManagerGlobal";
    private static final String WINDOW_MANAGER_IMPL_CLAZZ = "android.view.WindowManagerImpl";
    private static final String WINDOW_PARAMS_FIELD = "mParams";
    private boolean initialized;
    private Field paramsField;
    private Field viewsField;
    private Object windowManagerObj;

    /* JADX INFO: compiled from: AndroidRootResolver.kt */
    @Metadata(m43474d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\n\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m43475d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$ListenableArrayList;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "()V", "listener", "Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", "add", "", "value", "remove", "removeAt", "index", "", "setListener", "", "facebook-core_release"}, m43476k = 1, m43477mv = {1, 5, 1})
    public static final class ListenableArrayList extends ArrayList<View> {
        private Listener listener;

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(View value) {
            Listener listener;
            boolean zAdd = super.add(value);
            if (zAdd && (listener = this.listener) != null) {
                if (listener != null) {
                    listener.onRootAdded(value);
                }
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onRootsChanged(this);
                }
            }
            return zAdd;
        }

        public /* bridge */ boolean contains(View view) {
            return super.contains((Object) view);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return contains((View) obj);
            }
            return false;
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ int indexOf(View view) {
            return super.indexOf((Object) view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return indexOf((View) obj);
            }
            return -1;
        }

        public /* bridge */ int lastIndexOf(View view) {
            return super.lastIndexOf((Object) view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ View remove(int i) {
            return remove(i);
        }

        public boolean remove(View value) {
            Listener listener;
            boolean zRemove = super.remove((Object) value);
            if (zRemove && (listener = this.listener) != null && (value instanceof View)) {
                if (listener != null) {
                    listener.onRootRemoved(value);
                }
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onRootsChanged(this);
                }
            }
            return zRemove;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj != null ? obj instanceof View : true) {
                return remove((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: removeAt, reason: merged with bridge method [inline-methods] */
        public View remove(int index) {
            View view = (View) super.remove(index);
            Listener listener = this.listener;
            if (listener != null) {
                if (listener != null) {
                    listener.onRootRemoved(view);
                }
                Listener listener2 = this.listener;
                if (listener2 != null) {
                    listener2.onRootsChanged(this);
                }
            }
            return view;
        }

        public final void setListener(Listener listener) {
            this.listener = listener;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return getSize();
        }
    }

    /* JADX INFO: compiled from: AndroidRootResolver.kt */
    @Metadata(m43474d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\tH&¨\u0006\n"}, m43475d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Listener;", "", "onRootAdded", "", "root", "Landroid/view/View;", "onRootRemoved", "onRootsChanged", "roots", "", "facebook-core_release"}, m43476k = 1, m43477mv = {1, 5, 1})
    public interface Listener {
        void onRootAdded(View root);

        void onRootRemoved(View root);

        void onRootsChanged(List<? extends View> roots);
    }

    /* JADX INFO: compiled from: AndroidRootResolver.kt */
    @Metadata(m43474d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m43475d2 = {"Lcom/facebook/internal/logging/dumpsys/AndroidRootResolver$Root;", "", "view", "Landroid/view/View;", "param", "Landroid/view/WindowManager$LayoutParams;", "(Landroid/view/View;Landroid/view/WindowManager$LayoutParams;)V", "getParam", "()Landroid/view/WindowManager$LayoutParams;", "getView", "()Landroid/view/View;", "facebook-core_release"}, m43476k = 1, m43477mv = {1, 5, 1})
    public static final class Root {
        private final WindowManager.LayoutParams param;
        private final View view;

        public Root(View view, WindowManager.LayoutParams param) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(param, "param");
            this.view = view;
            this.param = param;
        }

        public final WindowManager.LayoutParams getParam() {
            return this.param;
        }

        public final View getView() {
            return this.view;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("AndroidRootResolver", "AndroidRootResolver::class.java.simpleName");
        TAG = "AndroidRootResolver";
    }

    private final void initialize() {
        this.initialized = true;
        try {
            Class<?> cls = Class.forName(WINDOW_MANAGER_GLOBAL_CLAZZ);
            Intrinsics.checkNotNullExpressionValue(cls, "Class.forName(accessClass)");
            Method method = cls.getMethod("getInstance", null);
            Intrinsics.checkNotNullExpressionValue(method, "clazz.getMethod(instanceMethod)");
            this.windowManagerObj = method.invoke(null, null);
            Field declaredField = cls.getDeclaredField(VIEWS_FIELD);
            this.viewsField = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            Field declaredField2 = cls.getDeclaredField(WINDOW_PARAMS_FIELD);
            this.paramsField = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (ClassNotFoundException e) {
            String str = TAG;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("could not find class: %s", Arrays.copyOf(new Object[]{WINDOW_MANAGER_GLOBAL_CLAZZ}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
            Log.d(str, str2, e);
        } catch (IllegalAccessException e2) {
            String str3 = TAG;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str4 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{WINDOW_MANAGER_GLOBAL_CLAZZ, "getInstance", VIEWS_FIELD}, 3));
            Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
            Log.d(str3, str4, e2);
        } catch (NoSuchFieldException e3) {
            String str5 = TAG;
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str6 = String.format("could not find field: %s or %s on %s", Arrays.copyOf(new Object[]{WINDOW_PARAMS_FIELD, VIEWS_FIELD, WINDOW_MANAGER_GLOBAL_CLAZZ}, 3));
            Intrinsics.checkNotNullExpressionValue(str6, "java.lang.String.format(format, *args)");
            Log.d(str5, str6, e3);
        } catch (NoSuchMethodException e4) {
            String str7 = TAG;
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String str8 = String.format("could not find method: %s on %s", Arrays.copyOf(new Object[]{"getInstance", WINDOW_MANAGER_GLOBAL_CLAZZ}, 2));
            Intrinsics.checkNotNullExpressionValue(str8, "java.lang.String.format(format, *args)");
            Log.d(str7, str8, e4);
        } catch (RuntimeException e5) {
            String str9 = TAG;
            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
            String str10 = String.format("reflective setup failed using obj: %s method: %s field: %s", Arrays.copyOf(new Object[]{WINDOW_MANAGER_GLOBAL_CLAZZ, "getInstance", VIEWS_FIELD}, 3));
            Intrinsics.checkNotNullExpressionValue(str10, "java.lang.String.format(format, *args)");
            Log.d(str9, str10, e5);
        } catch (InvocationTargetException e6) {
            String str11 = TAG;
            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
            String str12 = String.format("could not invoke: %s on %s", Arrays.copyOf(new Object[]{"getInstance", WINDOW_MANAGER_GLOBAL_CLAZZ}, 2));
            Intrinsics.checkNotNullExpressionValue(str12, "java.lang.String.format(format, *args)");
            Log.d(str11, str12, e6.getCause());
        }
    }

    public final void attachActiveRootListener(Listener listener) {
        if (listener == null) {
            return;
        }
        if (!this.initialized) {
            initialize();
        }
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            Intrinsics.checkNotNullExpressionValue(declaredField, "Field::class.java.getDeclaredField(\"accessFlags\")");
            declaredField.setAccessible(true);
            Field field = this.viewsField;
            declaredField.setInt(field, field != null ? field.getModifiers() : 0);
            Field field2 = this.viewsField;
            Object obj = field2 != null ? field2.get(this.windowManagerObj) : null;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
            }
            ListenableArrayList listenableArrayList = new ListenableArrayList();
            listenableArrayList.setListener(listener);
            listenableArrayList.addAll((ArrayList) obj);
            Field field3 = this.viewsField;
            if (field3 != null) {
                field3.set(this.windowManagerObj, listenableArrayList);
            }
        } catch (Throwable th) {
            Log.d(TAG, "Couldn't attach root listener.", th);
        }
    }

    public final List<Root> listActiveRoots() {
        if (!this.initialized) {
            initialize();
        }
        if (this.windowManagerObj == null) {
            Log.d(TAG, "No reflective access to windowmanager object.");
            return null;
        }
        if (this.viewsField == null) {
            Log.d(TAG, "No reflective access to mViews");
            return null;
        }
        if (this.paramsField == null) {
            Log.d(TAG, "No reflective access to mPArams");
            return null;
        }
        try {
            Field field = this.viewsField;
            List listEmptyList = (List) (field != null ? field.get(this.windowManagerObj) : null);
            Field field2 = this.paramsField;
            List list = (List) (field2 != null ? field2.get(this.windowManagerObj) : null);
            ArrayList arrayList = new ArrayList();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            for (Pair pair : CollectionsKt.zip(listEmptyList, list != null ? list : CollectionsKt.emptyList())) {
                arrayList.add(new Root((View) pair.component1(), (WindowManager.LayoutParams) pair.component2()));
            }
            return arrayList;
        } catch (IllegalAccessException e) {
            String str = TAG;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.viewsField, this.paramsField, this.windowManagerObj}, 3));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
            Log.d(str, str2, e);
            return null;
        } catch (RuntimeException e2) {
            String str3 = TAG;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str4 = String.format("Reflective access to %s or %s on %s failed.", Arrays.copyOf(new Object[]{this.viewsField, this.paramsField, this.windowManagerObj}, 3));
            Intrinsics.checkNotNullExpressionValue(str4, "java.lang.String.format(format, *args)");
            Log.d(str3, str4, e2);
            return null;
        }
    }
}
