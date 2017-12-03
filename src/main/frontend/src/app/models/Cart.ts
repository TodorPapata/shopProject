import { Product } from "./Product";

export class Cart {
    id: number;
    username: string;
    email: string;
    code: string;
    imageUrl: string;
    dateAdded: Date;
    products: Product[];
}
