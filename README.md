Payload compression can significantly reduce the size of the data transmitted between a client and a server, improving performance and reducing bandwidth usage. In a Spring Boot application, you can enable compression for REST API responses using the built-in support for HTTP message compression.

# Enabling Payload Compression in Spring Boot
To enable payload compression in a Spring Boot application, you can configure it in the application.properties or application.yml file. Here's how you can do it:

Using application.properties
properties

==================================================

### Enable response compression
````server.compression.enabled=true````

### Set the minimum response size to compress (e.g., 2KB)
````server.compression.min-response-size=2048````

### Specify the mime types to compress (optional, defaults to text/html, text/xml, text/plain)
````server.compression.mime-types=text/html,text/xml,text/plain,application/json````

## Testing using Postman
1. Open Postman.
2. Create a new GET request to http://localhost:8080/large.
3. In the Headers section, add Accept-Encoding with the value gzip.
4. Send the request and inspect the response headers to see if the Content-Encoding header is set to gzip.
5. Inspecting Response Headers
     Look for the Content-Encoding: gzip header in the response. This indicates that the response payload is compressed.
