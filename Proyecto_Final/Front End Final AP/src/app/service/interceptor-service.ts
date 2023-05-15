import { HTTP_INTERCEPTORS, HttpEvent, HttpHandler, HttpRequest } from "@angular/common/http";
import { TokenService } from "./token.service";
import { Observable } from "rxjs/internal/Observable";
import { Injectable } from "@angular/core";


@Injectable()
export class InterceptService {
    constructor(private tokenService: TokenService){}

    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
        let intReq = req;
        const token = this.tokenService.getToken();
        if(token != null){
            intReq = req.clone({
                headers: req.headers.set('Authorization', 'Bearer'+token)
            });
        }
        return next.handle(intReq);
    }
}

export const interceptProvider = [{
    provide: HTTP_INTERCEPTORS,
    useClass: InterceptService,
    multi: true
}];
