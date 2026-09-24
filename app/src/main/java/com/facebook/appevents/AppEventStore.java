package com.facebook.appevents;

import android.content.Context;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppEventStore.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0017\u0010\u0010\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m43475d2 = {"Lcom/facebook/appevents/AppEventStore;", "", "()V", "PERSISTED_EVENTS_FILENAME", "", "TAG", "persistEvents", "", "accessTokenAppIdPair", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "appEvents", "Lcom/facebook/appevents/SessionEventsState;", "eventsToPersist", "Lcom/facebook/appevents/AppEventCollection;", "readAndClearStore", "Lcom/facebook/appevents/PersistedEvents;", "saveEventsToDisk", "saveEventsToDisk$facebook_core_release", "MovedClassObjectInputStream", "facebook-core_release"}, m43476k = 1, m43477mv = {1, 5, 1})
public final class AppEventStore {
    public static final AppEventStore INSTANCE = new AppEventStore();
    private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
    private static final String TAG;

    /* JADX INFO: compiled from: AppEventStore.kt */
    @Metadata(m43474d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\b"}, m43475d2 = {"Lcom/facebook/appevents/AppEventStore$MovedClassObjectInputStream;", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "(Ljava/io/InputStream;)V", "readClassDescriptor", "Ljava/io/ObjectStreamClass;", "Companion", "facebook-core_release"}, m43476k = 1, m43477mv = {1, 5, 1})
    private static final class MovedClassObjectInputStream extends ObjectInputStream {
        private static final String ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1";
        private static final String APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME = "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2";

        public MovedClassObjectInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            if (Intrinsics.areEqual(resultClassDescriptor.getName(), ACCESS_TOKEN_APP_ID_PAIR_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AccessTokenAppIdPair.SerializationProxyV1.class);
            } else if (Intrinsics.areEqual(resultClassDescriptor.getName(), APP_EVENT_SERIALIZATION_PROXY_V1_CLASS_NAME)) {
                resultClassDescriptor = ObjectStreamClass.lookup(AppEvent.SerializationProxyV2.class);
            }
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    static {
        String name = AppEventStore.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "AppEventStore::class.java.name");
        TAG = name;
    }

    private AppEventStore() {
    }

    @JvmStatic
    public static final synchronized void persistEvents(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState appEvents) {
        if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            AppEventUtility.assertIsNotMainThread();
            PersistedEvents andClearStore = readAndClearStore();
            andClearStore.addEvents(accessTokenAppIdPair, appEvents.getEventsToPersist());
            saveEventsToDisk$facebook_core_release(andClearStore);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventStore.class);
        }
    }

    @JvmStatic
    public static final synchronized void persistEvents(AppEventCollection eventsToPersist) {
        if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
            AppEventUtility.assertIsNotMainThread();
            PersistedEvents andClearStore = readAndClearStore();
            for (AccessTokenAppIdPair accessTokenAppIdPair : eventsToPersist.keySet()) {
                SessionEventsState sessionEventsState = eventsToPersist.get(accessTokenAppIdPair);
                if (sessionEventsState == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                andClearStore.addEvents(accessTokenAppIdPair, sessionEventsState.getEventsToPersist());
            }
            saveEventsToDisk$facebook_core_release(andClearStore);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventStore.class);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bf A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #6 {all -> 0x00c6, blocks: (B:9:0x000e, B:14:0x003c, B:15:0x0041, B:50:0x00bf, B:18:0x004d, B:29:0x006f, B:30:0x0074, B:33:0x007f, B:34:0x0085, B:36:0x008a, B:37:0x008f, B:41:0x00a3, B:40:0x009a, B:43:0x00a5, B:44:0x00aa, B:47:0x00b5), top: B:65:0x000e, outer: #11, inners: #2, #3, #7, #9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context] */
    @JvmStatic
    public static final synchronized PersistedEvents readAndClearStore() {
        MovedClassObjectInputStream movedClassObjectInputStream;
        String str;
        String str2;
        Exception exc;
        PersistedEvents persistedEvents;
        ?? IsObjectCrashing = CrashShieldHandler.isObjectCrashing(AppEventStore.class);
        if (IsObjectCrashing != 0) {
            return null;
        }
        try {
            try {
                AppEventUtility.assertIsNotMainThread();
                IsObjectCrashing = FacebookSdk.getApplicationContext();
                try {
                    FileInputStream fileInputStreamOpenFileInput = IsObjectCrashing.openFileInput(PERSISTED_EVENTS_FILENAME);
                    Intrinsics.checkNotNullExpressionValue(fileInputStreamOpenFileInput, "context.openFileInput(PERSISTED_EVENTS_FILENAME)");
                    movedClassObjectInputStream = new MovedClassObjectInputStream(new BufferedInputStream(fileInputStreamOpenFileInput));
                    try {
                        Object object = movedClassObjectInputStream.readObject();
                        if (object == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                        }
                        persistedEvents = (PersistedEvents) object;
                        Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            IsObjectCrashing.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e) {
                            Log.w(TAG, "Got unexpected exception when removing events file: ", e);
                        }
                        if (persistedEvents == null) {
                            persistedEvents = new PersistedEvents();
                        }
                        return persistedEvents;
                    } catch (FileNotFoundException unused) {
                        Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            IsObjectCrashing.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e2) {
                            str = TAG;
                            str2 = "Got unexpected exception when removing events file: ";
                            exc = e2;
                            Log.w(str, str2, exc);
                            persistedEvents = null;
                            if (persistedEvents == null) {
                                persistedEvents = new PersistedEvents();
                            }
                            return persistedEvents;
                        }
                        persistedEvents = null;
                        if (persistedEvents == null) {
                            persistedEvents = new PersistedEvents();
                        }
                        return persistedEvents;
                    } catch (Exception e3) {
                        e = e3;
                        Log.w(TAG, "Got unexpected exception while reading events: ", e);
                        Utility.closeQuietly(movedClassObjectInputStream);
                        try {
                            IsObjectCrashing.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception e4) {
                            str = TAG;
                            str2 = "Got unexpected exception when removing events file: ";
                            exc = e4;
                            Log.w(str, str2, exc);
                            persistedEvents = null;
                            if (persistedEvents == null) {
                                persistedEvents = new PersistedEvents();
                            }
                            return persistedEvents;
                        }
                        persistedEvents = null;
                        if (persistedEvents == null) {
                            persistedEvents = new PersistedEvents();
                        }
                        return persistedEvents;
                    }
                } catch (FileNotFoundException unused2) {
                    movedClassObjectInputStream = null;
                } catch (Exception e5) {
                    e = e5;
                    movedClassObjectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    Utility.closeQuietly((Closeable) null);
                    try {
                        IsObjectCrashing.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                    } catch (Exception e6) {
                        Log.w(TAG, "Got unexpected exception when removing events file: ", e6);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, AppEventStore.class);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @JvmStatic
    public static final void saveEventsToDisk$facebook_core_release(PersistedEvents eventsToPersist) {
        if (CrashShieldHandler.isObjectCrashing(AppEventStore.class)) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(applicationContext.openFileOutput(PERSISTED_EVENTS_FILENAME, 0)));
                try {
                    objectOutputStream2.writeObject(eventsToPersist);
                    Utility.closeQuietly(objectOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    try {
                        Log.w(TAG, "Got unexpected exception while persisting events: ", th);
                        try {
                            applicationContext.getFileStreamPath(PERSISTED_EVENTS_FILENAME).delete();
                        } catch (Exception unused) {
                        }
                    } finally {
                        Utility.closeQuietly(objectOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            CrashShieldHandler.handleThrowable(th3, AppEventStore.class);
        }
    }
}
