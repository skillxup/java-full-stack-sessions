import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name: 'capitalize'
})

export class CapitalizePipe implements PipeTransform {
    transform(value: string, todos: boolean = true): string {
        // leO SmIth
        value = value.toLowerCase(); // leo smith
        let splits = value.split(' '); // [0] = leo, [1] = [smith]

        if(todos) {
            for(let i in splits) {
                splits[i] = splits[i][0].toUpperCase() + splits[i].substring(1); // Leo 
            }
        } else {
            splits[0] = splits[0][0].toUpperCase() + splits[0].substr(1);
        }

        return splits.join(' '); // Leo smith
    }
}