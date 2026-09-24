package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.p300io.FilesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.q6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3999q6 implements InterfaceC4084u3 {

    /* JADX INFO: renamed from: e */
    public static final a f15857e = new a(null);

    /* JADX INFO: renamed from: a */
    public final Context f15858a;

    /* JADX INFO: renamed from: b */
    public final CoroutineDispatcher f15859b;

    /* JADX INFO: renamed from: c */
    public final String f15860c;

    /* JADX INFO: renamed from: d */
    public final Lazy f15861d;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$b */
    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            try {
                File cacheDir = C3999q6.this.f15858a.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                File file = new File(cacheDir, C3999q6.this.f15860c);
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (file.exists() && file.isDirectory()) {
                    return file;
                }
                return null;
            } catch (SecurityException e) {
                C4048sb.m19410b("SecurityException accessing or creating cache directory", e);
                return null;
            } catch (Exception e2) {
                C4048sb.m19410b("Error accessing or creating cache directory", e2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$c */
    public static final class c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15863b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URL f15865d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(URL url, Continuation continuation) {
            super(2, continuation);
            this.f15865d = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3999q6.this.new c(this.f15865d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15863b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            C3999q6 c3999q6 = C3999q6.this;
            File fileMo19101a = c3999q6.mo19101a(this.f15865d);
            File fileM19116c = C3999q6.this.m19116c(this.f15865d);
            this.f15863b = 1;
            Object objMo19102a = c3999q6.mo19102a(fileMo19101a, fileM19116c, this);
            return objMo19102a == coroutine_suspended ? coroutine_suspended : objMo19102a;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$d */
    public static final class d extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15866b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f15867c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ File f15868d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file, File file2, Continuation continuation) {
            super(2, continuation);
            this.f15867c = file;
            this.f15868d = file2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f15867c, this.f15868d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15866b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            try {
                if (this.f15867c.exists()) {
                    this.f15867c.delete();
                }
                if (this.f15868d.exists()) {
                    if (!this.f15868d.delete()) {
                        C4048sb.m19417e("Failed to delete data file: " + this.f15868d.getAbsolutePath(), null, 2, null);
                        return Boxing.boxBoolean(false);
                    }
                    z = true;
                }
            } catch (Exception e) {
                C4048sb.m19410b("Error deleting cache files: " + this.f15868d.getName(), e);
            }
            return Boxing.boxBoolean(z);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$e */
    public static final class e extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15869b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f15870c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ File f15871d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(File file, File file2, Continuation continuation) {
            super(2, continuation);
            this.f15870c = file;
            this.f15871d = file2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f15870c, this.f15871d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean zRenameTo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15869b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                zRenameTo = this.f15870c.renameTo(this.f15871d);
            } catch (Exception e) {
                C4048sb.m19410b("Error during finalizeDataFile (renameTo) from " + this.f15870c.getName() + " to " + this.f15871d.getName(), e);
                zRenameTo = false;
            }
            return Boxing.boxBoolean(zRenameTo);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$f */
    public static final class f extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15872b;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: a */
        public static final boolean m19123a(File file) {
            if (file.isFile()) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.endsWith$default(name, ".tmp", false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3999q6.this.new f(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15872b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File fileM19109b = C3999q6.this.m19109b();
            if (fileM19109b == null) {
                return Boxing.boxLong(0L);
            }
            Ref.LongRef longRef = new Ref.LongRef();
            File[] fileArrListFiles = fileM19109b.listFiles(new FileFilter() { // from class: com.chartboost.sdk.impl.q6$f$$ExternalSyntheticLambda0
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    return C3999q6.f.m19123a(file);
                }
            });
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    C4048sb.m19417e("Cleaning up stray temp file during init: " + file.getName(), null, 2, null);
                    try {
                        file.delete();
                    } catch (Exception e) {
                        C4048sb.m19410b("Failed to delete temp file " + file.getName() + " during init", e);
                    }
                }
            }
            File[] fileArrListFiles2 = fileM19109b.listFiles();
            if (fileArrListFiles2 != null) {
                C3999q6 c3999q6 = C3999q6.this;
                for (File file2 : fileArrListFiles2) {
                    try {
                        Intrinsics.checkNotNull(file2);
                        if (c3999q6.m19117c(file2)) {
                            if (c3999q6.mo19100a(file2).exists()) {
                                longRef.element += file2.length();
                            } else {
                                C4048sb.m19417e("Metadata missing for " + file2.getName() + ", deleting data file.", null, 2, null);
                                file2.delete();
                            }
                        } else if (c3999q6.m19118d(file2) && !c3999q6.m19110b(file2).exists()) {
                            C4048sb.m19417e("Data file missing for " + file2.getName() + ", deleting metadata file.", null, 2, null);
                            file2.delete();
                        }
                    } catch (Exception e2) {
                        C4048sb.m19410b("Error processing file during init: " + file2.getAbsolutePath(), e2);
                    }
                }
            }
            return Boxing.boxLong(longRef.element);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$g */
    public static final class g extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15874b;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: a */
        public static final boolean m19125a(C3999q6 c3999q6, File file) {
            Intrinsics.checkNotNull(file);
            return c3999q6.m19117c(file);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3999q6.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15874b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File fileM19109b = C3999q6.this.m19109b();
            if (fileM19109b != null) {
                final C3999q6 c3999q6 = C3999q6.this;
                File[] fileArrListFiles = fileM19109b.listFiles(new FileFilter() { // from class: com.chartboost.sdk.impl.q6$g$$ExternalSyntheticLambda0
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return C3999q6.g.m19125a(c3999q6, file);
                    }
                });
                if (fileArrListFiles != null && (list = ArraysKt.toList(fileArrListFiles)) != null) {
                    return list;
                }
            }
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$h */
    public static final class h extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15876b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URL f15878d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(URL url, Continuation continuation) {
            super(2, continuation);
            this.f15878d = url;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3999q6.this.new h(this.f15878d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15876b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            C3999q6 c3999q6 = C3999q6.this;
            File fileM19116c = c3999q6.m19116c(this.f15878d);
            this.f15876b = 1;
            Object objMo19112b = c3999q6.mo19112b(fileM19116c, this);
            return objMo19112b == coroutine_suspended ? coroutine_suspended : objMo19112b;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$i */
    public static final class i extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15879b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f15880c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file, Continuation continuation) {
            super(2, continuation);
            this.f15880c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new i(this.f15880c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15879b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (!this.f15880c.exists()) {
                return null;
            }
            try {
                return C4018r3.f16111c.m19296a(FilesKt.readText(this.f15880c, Charsets.UTF_8));
            } catch (IOException e) {
                C4048sb.m19410b("IOException reading metadata file " + this.f15880c.getName(), e);
                return null;
            } catch (Exception e2) {
                C4048sb.m19410b("Error reading metadata file " + this.f15880c.getName(), e2);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$j */
    public static final class j extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public static final j f15881b = new j();

        public j() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final CharSequence m19129a(byte b) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m19129a(((Number) obj).byteValue());
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$k */
    public static final class k extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15882b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ File f15883c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(File file, Continuation continuation) {
            super(2, continuation);
            this.f15883c = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new k(this.f15883c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15882b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            boolean z = false;
            try {
                if (this.f15883c.exists()) {
                    this.f15883c.setLastModified(System.currentTimeMillis());
                    z = true;
                }
            } catch (Exception e) {
                C4048sb.m19410b("Failed to update access time for " + this.f15883c.getName(), e);
            }
            return Boxing.boxBoolean(z);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.q6$l */
    public static final class l extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15884b;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ URL f15886d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C4018r3 f15887e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(URL url, C4018r3 c4018r3, Continuation continuation) {
            super(2, continuation);
            this.f15886d = url;
            this.f15887e = c4018r3;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C3999q6.this.new l(this.f15886d, this.f15887e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15884b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File fileM19116c = C3999q6.this.m19116c(this.f15886d);
            File file = new File(fileM19116c.getParentFile(), fileM19116c.getName() + ".tmp");
            boolean z = false;
            try {
                FilesKt.writeText(file, this.f15887e.m19295c(), Charsets.UTF_8);
                if (file.renameTo(fileM19116c)) {
                    z = true;
                } else {
                    C4048sb.m19411b("Failed to rename temp metadata file " + file.getName() + " to " + fileM19116c.getName(), (Throwable) null, 2, (Object) null);
                    file.delete();
                }
            } catch (IOException e) {
                C4048sb.m19410b("Failed to write metadata to temp file " + file.getName(), e);
                file.delete();
            } catch (Exception e2) {
                C4048sb.m19410b("Error writing metadata for " + fileM19116c.getName(), e2);
                file.delete();
            }
            return Boxing.boxBoolean(z);
        }
    }

    public C3999q6(Context context, CoroutineDispatcher ioDispatcher, String cacheSubdir) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(cacheSubdir, "cacheSubdir");
        this.f15858a = context;
        this.f15859b = ioDispatcher;
        this.f15860c = cacheSubdir;
        this.f15861d = LazyKt.lazy(new b());
    }

    public /* synthetic */ C3999q6(Context context, CoroutineDispatcher coroutineDispatcher, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i2 & 4) != 0 ? "managed_file_cache_v2" : str);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public File mo19099a() {
        return m19109b();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public File mo19100a(File dataFile) {
        Intrinsics.checkNotNullParameter(dataFile, "dataFile");
        File parentFile = dataFile.getParentFile();
        String name = dataFile.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new File(parentFile, StringsKt.removeSuffix(name, (CharSequence) ".dat") + ".meta");
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public File mo19101a(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        File fileM19109b = m19109b();
        if (fileM19109b == null) {
            throw new IllegalArgumentException("Cache directory not available".toString());
        }
        return new File(fileM19109b, m19115b(url) + ".dat");
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public Object mo19102a(File file, File file2, Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new d(file2, file, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public Object mo19103a(File file, Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new k(file, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public Object mo19104a(URL url, C4018r3 c4018r3, Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new l(url, c4018r3, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public Object mo19105a(URL url, Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new c(url, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public Object mo19106a(Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new f(null), continuation);
    }

    /* JADX INFO: renamed from: a */
    public final String m19107a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNull(bArrDigest);
            return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) j.f15881b, 30, (Object) null);
        } catch (Exception e2) {
            C4048sb.m19410b("Failed to compute SHA-256 for '" + str + "', falling back to hashCode", e2);
            String string = Integer.toString(Math.abs(str.hashCode()), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: a */
    public boolean mo19108a(long j2) {
        File fileM19109b = m19109b();
        if (fileM19109b == null) {
            return false;
        }
        try {
            long availableBytes = new StatFs(fileM19109b.getAbsolutePath()).getAvailableBytes();
            if (availableBytes >= j2) {
                return true;
            }
            C4048sb.m19417e("Insufficient disk space. Available: " + availableBytes + " bytes, Required minimum: " + j2 + " bytes.", null, 2, null);
            return false;
        } catch (Exception e2) {
            C4048sb.m19410b("Failed to check available disk space", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final File m19109b() {
        return (File) this.f15861d.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final File m19110b(File file) {
        File parentFile = file.getParentFile();
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new File(parentFile, StringsKt.removeSuffix(name, (CharSequence) ".meta") + ".dat");
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: b */
    public Object mo19111b(File file, File file2, Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new e(file, file2, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: b */
    public Object mo19112b(File file, Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new i(file, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: b */
    public Object mo19113b(URL url, Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new h(url, null), continuation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4084u3
    /* JADX INFO: renamed from: b */
    public Object mo19114b(Continuation continuation) {
        return BuildersKt.withContext(this.f15859b, new g(null), continuation);
    }

    /* JADX INFO: renamed from: b */
    public final String m19115b(URL url) {
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return "cache_" + m19107a(string);
    }

    /* JADX INFO: renamed from: c */
    public File m19116c(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        File fileM19109b = m19109b();
        if (fileM19109b == null) {
            throw new IllegalArgumentException("Cache directory not available".toString());
        }
        return new File(fileM19109b, m19115b(url) + ".meta");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19117c(File file) {
        if (file.isFile() && file.exists()) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "cache_", false, 2, (Object) null)) {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.endsWith$default(name2, ".dat", false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19118d(File file) {
        if (file.isFile() && file.exists()) {
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "cache_", false, 2, (Object) null)) {
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (StringsKt.endsWith$default(name2, ".meta", false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
