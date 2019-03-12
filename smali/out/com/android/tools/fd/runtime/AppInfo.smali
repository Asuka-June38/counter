.class public Lcom/android/tools/fd/runtime/AppInfo;
.super Ljava/lang/Object;


# static fields
.field public static applicationClass:Ljava/lang/String;

.field public static applicationId:Ljava/lang/String;

.field public static token:J

.field public static usingApkSplits:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-string/jumbo v0, "com.tenchiken.multicounter"

    sput-object v0, Lcom/android/tools/fd/runtime/AppInfo;->applicationId:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Lcom/android/tools/fd/runtime/AppInfo;->applicationClass:Ljava/lang/String;

    const-wide v0, -0x6daf6882ffce8d0aL    # -1.83601154163288E-220

    sput-wide v0, Lcom/android/tools/fd/runtime/AppInfo;->token:J

    const/4 v0, 0x0

    sput-boolean v0, Lcom/android/tools/fd/runtime/AppInfo;->usingApkSplits:Z

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
