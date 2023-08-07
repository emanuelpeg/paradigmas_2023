import zhttp.service.Server
import zio._

object MainApp extends ZIOAppDefault {

  def run =
    Server.start(
      port = 8999,
      http = EndPoint()
    ).provide(
      ZLayer.fromZIO(Ref.make(0)),
    )

}