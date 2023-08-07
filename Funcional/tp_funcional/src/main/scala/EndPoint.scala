import zhttp.http._

object EndPoint {

  def apply(): Http[Any, Nothing, Request, Response] =
    Http.collect[Request] {

      // GET /translate?number=:number
      case req@(Method.GET -> !! / "translate") if (req.url.queryParams.nonEmpty) =>
        Response.text(NumberToChineseWords.format(req.url.queryParams("number").head.toInt))

    }


}
