# rate-limit-sample

This application will throttle the requests per second for each IP address

This requires google's Guava library.

LoadingCache class is being used to store request count and client ip address

 

 

So what this basically does is it stores all request making ip addresses in a LoadingCache. This is like a special map in which each entry has an expiration time. In the constructor the expiration time is set to 1 second. That means that on the first request an ip address plus its request count is only stored in the LoadingCache for one second. It is automatically removed from the map on expiration. If during that second more requests are coming from the ip address then the isMaximumRequestsPerSecondExceeded(String clientIpAddress) will add those requests to the total request count but before that checks whether the maximum request amount per second has already been exceeded. If thats the case it returns true and the filter returns an error response with statuscode 429 which stands for Too many requests.

 

This way only a set amount of requests can be made per user per second.

 

 

api details -

 

localhost:8080/customer/all - This api will return the response as TOO MANY REQUEST if the request is being invoked from the same ip addreess 5 times in one second.

(Junit testcase attached)

 

This solution is plug and play no need to add any code to the existing apis. Just need to create a HTTPFilter and add it to the filter configuration.

 

Another api is there which is http://localhost:8080/order/all which is not having any ratelimit filtr applied.

 
 run the application using 
 
 mvn clean install - this will run the junit testcase
 mvn spring-boot:run