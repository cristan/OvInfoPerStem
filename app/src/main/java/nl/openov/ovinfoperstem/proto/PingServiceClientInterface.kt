package nl.openov.ovinfoperstem.proto// Code generated by connect-kotlin. DO NOT EDIT.
//
// Source: pingService.proto
//
import com.connectrpc.Headers
import com.connectrpc.ResponseMessage

public interface PingServiceClientInterface {
  public suspend fun serviceAvailable(request: PingServiceOuterClass.Ping, headers: Headers = emptyMap()): ResponseMessage<PingServiceOuterClass.Pong>
}
