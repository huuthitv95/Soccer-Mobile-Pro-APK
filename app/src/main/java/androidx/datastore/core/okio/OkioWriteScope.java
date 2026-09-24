package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.FileHandle;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* JADX INFO: compiled from: OkioStorage.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m43474d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m43475d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", "T", "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "serializer", "Landroidx/datastore/core/okio/OkioSerializer;", "(Lokio/FileSystem;Lokio/Path;Landroidx/datastore/core/okio/OkioSerializer;)V", "writeData", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core-okio"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    /* JADX INFO: renamed from: androidx.datastore.core.okio.OkioWriteScope$writeData$1 */
    /* JADX INFO: compiled from: OkioStorage.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "androidx.datastore.core.okio.OkioWriteScope", m43504f = "OkioStorage.kt", m43505i = {0, 0, 0}, m43506l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE}, m43507m = "writeData", m43508n = {"$this$use$iv", "handle", "$this$use$iv"}, m43509s = {"L$0", "L$1", "L$2"})
    static final class C03981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ OkioWriteScope<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03981(OkioWriteScope<T> okioWriteScope, Continuation<? super C03981> continuation) {
            super(continuation);
            this.this$0 = okioWriteScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioWriteScope(FileSystem fileSystem, Path path, OkioSerializer<T> serializer) {
        super(fileSystem, path, serializer);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.datastore.core.WriteScope
    public Object writeData(T t, Continuation<? super Unit> continuation) throws Throwable {
        C03981 c03981;
        FileHandle fileHandleOpenReadWrite;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        FileHandle fileHandle;
        Unit unit;
        Throwable th2;
        Unit unit2;
        if (continuation instanceof C03981) {
            c03981 = (C03981) continuation;
            if ((c03981.label & Integer.MIN_VALUE) != 0) {
                c03981.label -= Integer.MIN_VALUE;
            } else {
                c03981 = new C03981(this, continuation);
            }
        } else {
            c03981 = new C03981(this, continuation);
        }
        Object obj = c03981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c03981.label;
        Throwable th3 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            checkClose();
            fileHandleOpenReadWrite = getFileSystem().openReadWrite(getPath());
            try {
                FileHandle fileHandle2 = fileHandleOpenReadWrite;
                BufferedSink bufferedSinkBuffer = Okio.buffer(FileHandle.sink$default(fileHandle2, 0L, 1, null));
                try {
                    OkioSerializer<T> serializer = getSerializer();
                    c03981.L$0 = fileHandleOpenReadWrite;
                    c03981.L$1 = fileHandle2;
                    c03981.L$2 = bufferedSinkBuffer;
                    c03981.label = 1;
                    if (serializer.writeTo(t, bufferedSinkBuffer, c03981) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeable = fileHandleOpenReadWrite;
                    fileHandle = fileHandle2;
                    closeable2 = bufferedSinkBuffer;
                } catch (Throwable th4) {
                    closeable = fileHandleOpenReadWrite;
                    th = th4;
                    closeable2 = bufferedSinkBuffer;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    th2 = th;
                    unit2 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                if (fileHandleOpenReadWrite != null) {
                    fileHandleOpenReadWrite.close();
                }
                th3 = th;
                unit = null;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable2 = (Closeable) c03981.L$2;
            fileHandle = (FileHandle) c03981.L$1;
            closeable = (Closeable) c03981.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th6) {
                th = th6;
                if (closeable2 != null) {
                    try {
                        try {
                            closeable2.close();
                        } catch (Throwable th7) {
                            ExceptionsKt.addSuppressed(th, th7);
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        fileHandleOpenReadWrite = closeable;
                        if (fileHandleOpenReadWrite != null) {
                            try {
                                fileHandleOpenReadWrite.close();
                            } catch (Throwable th9) {
                                ExceptionsKt.addSuppressed(th, th9);
                            }
                        }
                        th3 = th;
                        unit = null;
                    }
                }
                th2 = th;
                unit2 = null;
            }
        }
        fileHandle.flush();
        unit2 = Unit.INSTANCE;
        if (closeable2 != null) {
            try {
                closeable2.close();
            } catch (Throwable th10) {
                th2 = th10;
            }
        }
        th2 = null;
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(unit2);
        unit = Unit.INSTANCE;
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th11) {
                th3 = th11;
            }
        }
        if (th3 != null) {
            throw th3;
        }
        Intrinsics.checkNotNull(unit);
        return Unit.INSTANCE;
    }
}
